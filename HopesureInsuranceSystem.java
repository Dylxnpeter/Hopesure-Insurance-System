public class HopesureInsuranceSystem {

    public static void main(String[] args) {
        LoginManager loginManager = new LoginManager();
        loginManager.addUser("Novice", "12345678");

        // Optionally, add more users if needed
        // loginManager.addUser("newuser", "newpassword");

        loginManager.promptLogin();
    }
}
