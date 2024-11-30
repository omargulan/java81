package TaskJunit;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<String> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(String user) {
        if (user == null || user.isBlank()) {
            throw new IllegalArgumentException("User name cannot be null or blank");
        }
        users.add(user);
    }

    public void removeUser(String user) {
        if (!users.remove(user)) {
            throw new IllegalArgumentException("User not found");
        }
    }

    public List<String> getUsers() {
        return new ArrayList<>(users);
    }

    public void clearUsers() {
        users.clear();
    }
}
