package patterns.behavioral.interpreter.v1;

public class OrExpression implements PermissionExpression {
    private PermissionExpression expression1;
    private PermissionExpression expression2;

    public OrExpression(PermissionExpression expression1, PermissionExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpet(User user) {
        return expression1.interpet(user) || expression2.interpet(user);
    }

    @Override
    public String toString() {
        return expression1 + " OR " + expression2;
    }
}
