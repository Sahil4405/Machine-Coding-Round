public class Task {
    private String taskType;
    private String taskId;
    private String description;
    private Status status;

    public Task(){

    }

    public Task(String taskType, String taskId, String description) {
        this.taskType = taskType;
        this.taskId = taskId;
        this.description = description;
        this.status = Status.ToDo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        System.out.println("inside status");
        this.status = status;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
