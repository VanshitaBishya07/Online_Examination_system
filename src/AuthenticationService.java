import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    private Map<String, User> users = new HashMap<>();

    public AuthenticationService() {
        // Sample users for testing
        users.put("admin", new User("admin", "admin123", "admin"));
        users.put("student1", new User("student1", "student123", "student"));
    }

    public User authenticate(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
