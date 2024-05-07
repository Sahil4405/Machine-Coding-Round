import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class User {
    private String userName;
    private String email;
    private Map<User, Integer> listOfBalance;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
        this.listOfBalance = new HashMap<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<User, Integer> getListOfBalance() {
        return listOfBalance;
    }

    public void setListOfBalance(Map<User, Integer> listOfBalance) {
        this.listOfBalance = listOfBalance;
    }
}