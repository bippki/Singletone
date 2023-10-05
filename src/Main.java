public class Main {
    public static void main(String[] args) {
        PasswordManager passwordManager1 = PasswordManager.getInstance("mySecurePassword1");

        String password1 = passwordManager1.getPassword();

        PasswordManager passwordManager2 = PasswordManager.getInstance("mySecurePassword2");

        String password2 = passwordManager2.getPassword();

        System.out.println("Password from first instance: " + password1);
        System.out.println("Password from second instance: " + password2);
        System.out.println("Passwords are the same: " + (password1.equals(password2)));
    }
}