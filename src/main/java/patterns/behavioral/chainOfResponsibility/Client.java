package patterns.behavioral.chainOfResponsibility;

import patterns.behavioral.chainOfResponsibility.interfaces.LeaveApprover;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        LeaveApplication application = new LeaveApplication(
                LeaveApplication.Type.Sick,
                LocalDate.of(2024, 11, 1),
                LocalDate.of(2024, 11, 3)
        );
        LeaveApprover handler = createChain();
        handler.processLeaveApplication(application);
        System.out.printf("Final Application Status: %s%n", application.getStatus());
    }

    /** Create chain of request handlers and return the first handler in that chain */
    private static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        return new ProjectLead(manager);
    }
}
