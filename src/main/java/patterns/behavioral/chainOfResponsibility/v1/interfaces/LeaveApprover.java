package patterns.behavioral.chainOfResponsibility.v1.interfaces;

import patterns.behavioral.chainOfResponsibility.v1.LeaveApplication;

/** This represents a handler in the chain of responsibility. */
public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication application);

    String getApproverRole();
}
