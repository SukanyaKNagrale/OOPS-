package shopping;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class UserAuthentication {
    private Map<String, User> users;

    public UserAuthentication() {
        this.users = new HashMap<>();
    }

    public boolean registerUser(String username, String password, String email) {
        if (!isValidUsername(username)) {
            return false;
        }

        if (!isValidPassword(password)) {
            return false;
        }

        if (!isValidEmail(email)) {
            return false;
        }

        if (isUsernameTaken(username)) {
            return false;
        }

        User newUser = new User(username, password, email);
        users.put(username, newUser);
        return true;
    }

    public User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    private static boolean isValidUsername(String username) {
        boolean isValid = Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z]+$", username);
        if (!isValid) {
            System.out.println("Invalid username. Username must contain both lowercase and uppercase letters.");
        }
        return isValid;
    }

    private static boolean isValidPassword(String password) {
        boolean isValid = Pattern.matches("^(?=.*[A-Z])(?=.*[!@#$%^&*()])(?=.*[0-9])(?=.*[a-z]).{8,}$", password);
        if (!isValid) {
            System.out.println("Invalid password. Password must contain one uppercase letter, one special character, one number, and at least 8 characters.");
        }
        return isValid;
    }

    private static boolean isValidEmail(String email) {
        boolean isValid = email.contains("@");
        if (!isValid) {
            System.out.println("Invalid email. Email must contain the @ symbol.");
        }
        return isValid;
    }

    private boolean isUsernameTaken(String username) {
        if (users.containsKey(username)) {
            System.out.println("Username is already taken. Please choose a different one.");
            return true;
        }
        return false;
    }
}
