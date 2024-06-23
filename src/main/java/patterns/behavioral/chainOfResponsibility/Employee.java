package patterns.behavioral.chainOfResponsibility;

import patterns.behavioral.chainOfResponsibility.interfaces.LeaveApprover;

public abstract class Employee implements LeaveApprover {
    private String role;
    private LeaveApprover successor;

    public Employee(String role, LeaveApprover successor) {
        this.role = role;
        this.successor = successor;
    }

    /**
     * If request was processed successfully, pass this request to the next entity (successor).
     */
    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if (processRequest(application) && successor != null) {
            successor.processLeaveApplication(application);
        }
    }

    protected abstract boolean processRequest(LeaveApplication application);

    @Override
    public String getApproverRole() {
        return role;
    }
}
