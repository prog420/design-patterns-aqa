package patterns.behavioral.chainOfResponsibility.v1;

import patterns.behavioral.chainOfResponsibility.v1.interfaces.LeaveApprover;

/** A concrete handler */
public class Manager extends Employee {
    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        switch (application.getType()) {
            case Sick -> {
                application.approve(getApproverRole());
                return true;
            }
            case PTO -> {
                if (application.getNumberOfDays() <= 5) {
                    application.approve(getApproverRole());
                    return true;
                }
            }
        }
        application.reject(getApproverRole());
        return false;
    }
}
