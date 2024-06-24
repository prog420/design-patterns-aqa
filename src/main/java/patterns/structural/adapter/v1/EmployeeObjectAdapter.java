package patterns.structural.adapter.v1;

/**
 * An object adapter which use composition to translate interface
 * We implement target interface which is expected by our client code.
 */
public class EmployeeObjectAdapter implements Customer {
    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }
}
