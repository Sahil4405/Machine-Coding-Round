public class Players {
    private String playerId;
    private Integer position;

    public Players(String playerId) {
        this.playerId = playerId;
        this.position = 0;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }
}
