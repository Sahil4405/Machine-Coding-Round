import java.util.List;

public class PercentSplitStrategy implements SplitStrategy {
    public PercentSplitStrategy() {
        super();
    }

    @Override
    public List<User> expenseSplit(List<User> userList, Double totalAmount) {
        return List.of();
    }
}
