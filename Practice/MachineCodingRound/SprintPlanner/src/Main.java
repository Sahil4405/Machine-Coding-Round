import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User sahil = new User("sahil", "100");
        User harshit = new User("harshit", "200");

        UserManager userManager = new UserManager();
        userManager.addSprint("2024","1001");
        Sprint sprint1 = userManager.getSprintDetails("1001");
        System.out.println(sprint1.getSprintId());

        userManager.addTaskToSprint("2024", "Story", "99", "this is my first task");

        Task task1 = userManager.getTask("99");
        userManager.addTaskToUser("sahil", task1);
        System.out.println(task1.getTaskType());

        userManager.updateTaskStatus(Status.InProgress);
        List<Task> taskList = userManager.getTaskBasedOnSprint("2024");

        for (Task task: taskList){
            System.out.println("Task:: " + Status.valueOf(task.getStatus().toString()));
        }


    }
}