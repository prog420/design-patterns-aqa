package patterns.behavioral.chainOfResponsibility.v1;

import patterns.behavioral.chainOfResponsibility.v1.interfaces.LeaveApprover;

/** A concrete handler */
public class Director extends Employee {
    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        switch (application.getType()) {
            case Sick -> {
                if (application.getNumberOfDays() <= 7) {
                    application.approve(getApproverRole());
                    return true;
                }
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
