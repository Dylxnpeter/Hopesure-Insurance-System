import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginManager {

    private Map<String, String> userCredentials;

    public LoginManager() {
        userCredentials = new HashMap<>();
        // You can add initial credentials here, or use a method to add them later
        userCredentials.put("admin", "12345678");
        userCredentials.put("user", "12345678");
        userCredentials.put("programmer", "12345678");
    }

    public void addUser(String username, String password) {
        userCredentials.put(username, password);
    }

    public boolean authenticate(String username, String password) {
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }

    public void promptLogin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (authenticate(username, password)) {
            System.out.println("Access Granted. Redirecting to the homepage...");
            // Logic to redirect to homepage can be added here
        } else {
            System.out.println("Username or Password incorrect");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        LoginManager loginManager = new LoginManager();
        loginManager.promptLogin();
    }
}

