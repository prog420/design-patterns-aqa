package patterns.creational.builder.v2;

import java.util.Random;

/** Out client which also works as a "director" */
public class Client {
    public static void main(String[] args) {
        User.Builder builder = User.getBuilder();
        User firstUser = buildUser(builder);
        builder.reset();
        User secondUser = buildUser(builder);

        System.out.println(firstUser);
        System.out.println(secondUser);
    }

    private static User buildUser(User.Builder builder) {
        return builder
            .setName("Row Swanson")
            .setAge(new Random().nextInt(40, 60))
            .setCountry("USA")
            .setPhone("+1-999-888-55-44")
            .build();
    }
}
