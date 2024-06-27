package patterns.behavioral.templateMethod.v1;

import patterns.behavioral.templateMethod.v1.networks.Facebook;
import patterns.behavioral.templateMethod.v1.networks.Network;
import patterns.behavioral.templateMethod.v1.networks.Twitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("Enter username: ");
        String userName = reader.readLine();
        System.out.println("Enter password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.println("Enter message: ");
        String message = reader.readLine();

        System.out.println("""

            Choose social network for posting message.
            1 - Facebook
            2 - Twitter""");
        int choice = Integer.parseInt(reader.readLine());

        //Crete proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
