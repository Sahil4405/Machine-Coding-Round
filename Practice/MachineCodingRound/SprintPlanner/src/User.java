import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String userId;
    private List<Task> task;

    public User(String userName, String userId) {
        this.userName = userName;
        this.userId = userId;
        this.task = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }
}
