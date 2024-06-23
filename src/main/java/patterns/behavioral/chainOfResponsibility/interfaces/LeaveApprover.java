package patterns.behavioral.chainOfResponsibility.interfaces;

import patterns.behavioral.chainOfResponsibility.LeaveApplication;

/** This represents a handler in the chain of responsibility. */
public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();
}
