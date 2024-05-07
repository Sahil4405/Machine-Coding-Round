import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager {
    private Map<String, Task> userTask;
    private Sprint sprint;
    private Map<String, Sprint> sprintMap;
    private Map<String, Task> sprintTaskMap;
    private Map<String, Task> taskTypeMap;
    private List<Task> tasks;
    private Map<String, User> userMap;

    public UserManager() {
        this.userTask = new HashMap<>();
        this.sprintMap = new HashMap<>();
        this.sprintTaskMap = new HashMap<>();
        this.taskTypeMap = new HashMap<>();
        this.tasks = new ArrayList<>();
    }

    public void addUser(String userid, User user){
        userMap.put(userid, user);
    }

    public void addSprint(String id, String sprintNumebr){
        Sprint sprint1 = new Sprint(id, sprintNumebr);

        sprintMap.put(sprintNumebr, sprint1);
    }

    public Sprint getSprintDetails(String sprintNumber){
        return sprintMap.get(sprintNumber);
    }

    public void addTaskToSprint(String sprintID, String taskType, String taskId, String descriptioin){
        Task newTask = new Task(taskType, taskId, descriptioin);
        sprintTaskMap.put(sprintID, newTask);
        taskTypeMap.put(taskType, newTask);
        tasks.add(newTask);
    }

    public Task getTask(String taskId){
        for(Task task: tasks){
            if(task.getTaskId() == taskId){
                return task;
            }
        }
        return null;
    }

    public List<Task> getTaskBasedOnSprint(String sprintNumber){
        List<Task> taskList = new ArrayList<>();
        for(Map.Entry<String, Task> sprintTask: sprintTaskMap.entrySet()){
            if(sprintTask.getKey() == sprintNumber){
                taskList.add(sprintTask.getValue());
            }
        }
        return taskList;
    }

    private boolean validateStatusUpdate(Status oldStatus, Status newStatus){
        System.out.println(oldStatus + " " + newStatus);
        if((oldStatus == Status.ToDo && newStatus == Status.InProgress) || (oldStatus == Status.InProgress && newStatus == Status.Done)){
            return true;
        }

        return false;
    }

    public void addTaskToUser(String userName, Task task){
//        List<Task> taskList;
        User user = userMap.get(userName);

        if(user.getTask().ge > 2){
            System.out.println("Already 2 a");
            return;
        }

        for(Task task: userTask){
            if(task.g)
        }

        if(userTask.get(userName).s)
        userTask.put(userName, task);
    }

    public void updateTaskStatus(Status status){
        for (Task task: tasks){
            System.out.println(task.getStatus());
            if(validateStatusUpdate(task.getStatus(),status)){
                task.setStatus(status);
            }
        }
    }
}
