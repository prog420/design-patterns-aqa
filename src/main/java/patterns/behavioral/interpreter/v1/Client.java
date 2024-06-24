package patterns.behavioral.interpreter.v1;

public class Client {
    public static void main(String[] args) {
        ExpressionBuilder builder = new ExpressionBuilder();
        Report report1 = new Report("Cashflow report", "NOT ADMIN");

        PermissionExpression exp = builder.build(report1);
        System.out.println(exp);

        User user1 = new User("Dave", "USER", "ADMIN");
        User user2 = new User("Dave", "USER");
        System.out.println("User access report: " + exp.interpet(user1));
        System.out.println("User access report: " + exp.interpet(user2));
    }
}
