import java.util.List;

public interface SplitStrategy {
//    private User user;
//    private double totalAmount;

    public List<User> expenseSplit(List<User> userList, Double totalAmount);
//    public void validateExpense(Integer totalAmount, )
}
