package patterns.behavioral.interpreter.v1;


/** Terminal expression */
public class Permission implements PermissionExpression {
    private String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }
    @Override
    public boolean interpet(User user) {
        return user.getPermissions().contains(permission);
    }

    @Override
    public String toString() {
        return permission;
    }
}
