package patterns.behavioral.command.v1;

import java.util.LinkedList;
import java.util.List;


/**
 * This is invoker actually executing commands.
 */
public class MailTasksRunner implements Runnable{
    private Thread runner;
    private List<Command> pendingCommands;
    private volatile boolean stop;

    private static final MailTasksRunner RUNNER = new MailTasksRunner();

    public static MailTasksRunner getInstance() {
        return RUNNER;
    }

    private MailTasksRunner() {
        pendingCommands = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }

    /** Take pending commands and executes them. */
    @Override
    public void run() {
        while (true) {
            Command cmd = null;
            synchronized (pendingCommands) {
                if (pendingCommands.isEmpty()) {
                    try {
                        pendingCommands.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Runner interruped!");
                        if (stop) {
                            System.out.println("Runner stopping");
                        }
                    }
                } else {
                    cmd = pendingCommands.remove(0);
                }
            }
            if (cmd == null) {
                return;
            }
            cmd.execute();
        }
    }

    /** Giving it a command whill schedulire it from later execution */
    public void addCommand(Command cmd) {
        synchronized (pendingCommands) {
            pendingCommands.add(cmd);
        }
    }

    public void shutdown() {
        this.stop = true;
        this.runner.interrupt();
    }
}
