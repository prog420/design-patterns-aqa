package patterns.structural.adapter.v1;

public class Client {
    public static void main(String[] args) {
        BusinessCardDesigner designer = new BusinessCardDesigner();
        /** Using Class / Two-way adapter */
        EmployeeClassAdapter adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);
        String cardFromClassAdapter = designer.designCard(adapter);
        System.out.println(cardFromClassAdapter);
        /** Using Object Adapter */
        Employee employee = new Employee();
        populateEmployeeData(employee);
        EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(employee);
        String cardFromObjectAdapter = designer.designCard(objectAdapter);
        System.out.println(cardFromObjectAdapter);
    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("AllSafe CyberSecurity, New York City, New York");
    }
}
