package patterns.behavioral.interpreter.v1;

public class NotExpression implements PermissionExpression {
    private PermissionExpression expression;

    public NotExpression(PermissionExpression expression) {
        this.expression = expression;
    }

    @Override
    public boolean interpet(User user) {
        return !expression.interpet(user);
    }

    @Override
    public String toString() {
        return "NOT " + expression;
    }
}
