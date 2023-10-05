public class PasswordManager {
    private final String password;

    private static PasswordManager instance;

    private PasswordManager(String initialPassword) {

        this.password = initialPassword;
    }

    public static PasswordManager getInstance(String initialPassword) {

        if (instance == null) {
            instance = new PasswordManager(initialPassword);
        }
        return instance;
    }

    public String getPassword() {
        return password;
    }

}