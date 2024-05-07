import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserManager {
    private User user;
    private Map<String, User> userMap;
    private Map<String, Map<String, Double>> balanceSheet;
    private Map<String, Double> expenseList;
    private Factory factory;

    public UserManager() {
        this.userMap = new HashMap<>();
        this.balanceSheet = new HashMap<>();
        this.expenseList = new HashMap<>();
    }

    public void addUser(String userName, User user){
        userMap.put(userName,user);
    }


    public User getUser(String userName){
        return userMap.get(userName);
    }
    
    public void addExpenseEqually(String paidBy, Integer totalAmount, List<String> splitList){
        Double amountToBeSplit = (double) (totalAmount/(splitList.size()));
        User paidByUser = userMap.get(paidBy);

        for(String sp: splitList){
//            System.out.println();
            User loner = userMap.get(sp);
//            System.out.println();

            Map<String, Double> balance = balanceSheet.get(paidBy);
            if(balance == null){
//                balance =
                balance.put(loner.getUserName(), 0.0);
            }

//            balance = balance == null ? 0 : balance;

            Map<String, Double> payeeInformation = new HashMap<>();
            payeeInformation.put(loner.getUserName(), balance.get(loner.getUserName()) + amountToBeSplit);
            balanceSheet.put(paidByUser.getUserName(),payeeInformation);
        }

        expenseList.put(paidBy, amountToBeSplit);
    }

//    public void addExpense(String paidBy, Integer totalAmount, List<Split> splitList, String strategy){
//
//        if (strategy == "Equal Split"){
//            addExpenseEqually(paidBy, totalAmount, splitList);
//        } else if (strategy == "Exact") {
//
//        }
//        SplitStrategy splitStrategy = factory.getStrategy(strategy);
//    }



}
