import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Expense Sahil 1000 3 harshit prabhat tumati Equal


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Splitwise App!!");
        System.out.println("Choose from below option");
        System.out.println("Add Expense");
        System.out.println("Show");
        System.out.println("Show UserId");

        String Expense = "Add Expense";
        String Show = "Show";

        Scanner inputHelper = new Scanner(System.in);
        String inputText = inputHelper.nextLine();
        System.out.println("input" + inputText);
        String[] values = inputText.split(" ");
//        System.out.println(values[0]);

        UserManager userManager = new UserManager();

        User sahil = new User("Sahil", "sahil1223");
        User harshit = new User("harshit", "harsh123");
        User parbhat = new User("prabhat", "jhad");
        User tumati = new User("tumati", "tumati");

        userManager.addUser(sahil.getUserName(), sahil);
        userManager.addUser(harshit.getUserName(), harshit);
        userManager.addUser(parbhat.getUserName(), parbhat);
        userManager.addUser(tumati.getUserName(), tumati);
        userManager.updateBalance(sahil.getUserName(), )

        switch (values[0]){
            case "Expense":
                System.out.println("expense");
                Integer totalAmount = Integer.parseInt(values[2]);
                Integer numOfUsers = Integer.parseInt(values[3]);
                List<String> splits = new ArrayList<>();
                System.out.println("values " + values[3 + numOfUsers + 1]);

                String flag = values[3 + numOfUsers + 1];

                if(flag.equalsIgnoreCase("Equal")){
                    System.out.println("inside equal");
                    for(int i = 0; i < numOfUsers; i++){
                        splits.add(values[4 + i]);
                    }
                    userManager.addExpenseEqually(values[1], totalAmount, splits);
                } else if (values[2 + numOfUsers + 1] == "Exact") {

                }


                break;
            case "Show":
                System.out.println("sd");
                break;
            default:
                System.out.println("wrong input");
        }


    }
}