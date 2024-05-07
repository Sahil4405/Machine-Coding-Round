public class Factory {
    private String strategyName;
    public SplitStrategy getStrategy(String strategyName) {
        if(strategyName == "EqualExpense"){
            return new EqualSplitStrategy();
        } else if (strategyName == "Percentage") {
            return new PercentSplitStrategy();
        }

        return null;
    }
}
