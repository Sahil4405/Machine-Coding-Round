public class Sprint {
    private Task task;
    private String sprintId;
    private String sprintNumber;

    public Sprint(String sprintId, String sprintNumber) {
        this.task = new Task();
        this.sprintId = sprintId;
        this.sprintNumber = sprintNumber;
    }

//    public void addTask(Task task){
//
//    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public String getSprintId() {
        return sprintId;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }

    public String getSprintNumber() {
        return sprintNumber;
    }

    public void setSprintNumber(String sprintNumber) {
        this.sprintNumber = sprintNumber;
    }
}
