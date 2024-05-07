public class Player {
    private String userName;
    private Integer currentPosition;

    public Player(String userName) {
        this.userName = userName;
        this.currentPosition = 0;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
