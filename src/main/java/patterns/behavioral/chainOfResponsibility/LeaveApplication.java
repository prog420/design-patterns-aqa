package patterns.behavioral.chainOfResponsibility;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LeaveApplication {
    public enum Type {Sick, PTO, LOP};
    public enum Status {Pending, Approved, Rejected};

    private Type type;
    private LocalDate from;
    private LocalDate to;
    private String processedBy;
    private Status status;

    public LeaveApplication(Type type, LocalDate from, LocalDate to) {
        this.type = type;
        this.from = from;
        this.to = to;
        this.status = Status.Pending;
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public long getNumberOfDays() {
        return ChronoUnit.DAYS.between(to, from);
    }

    public void approve(String processedBy) {
        System.out.printf("Approved by %s%n", processedBy);
        this.processedBy = processedBy;
        this.status = Status.Approved;
    }

    public void reject(String processedBy) {
        System.out.printf("Rejected by %s%n", processedBy);
        this.processedBy = processedBy;
        this.status = Status.Rejected;
    }
}
