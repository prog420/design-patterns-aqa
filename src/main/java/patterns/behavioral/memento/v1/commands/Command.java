package patterns.behavioral.memento.v1.commands;

public interface Command {
    String getName();
    void execute();
}
