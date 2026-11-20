

import java.util.HashMap;
import java.util.Map;

public class LoginService {

    private Map<String, String> users = new HashMap<>();

    public LoginService() {

        users.put("priya", "1234");
        users.put("arun", "5678");
        users.put("kumar", "9876");
    }

    public boolean validate(String username, String password) {

        if (users.containsKey(username)) {

            if (users.get(username).equals(password)) {
                return true;
            }
        }

        return false;
    }
}