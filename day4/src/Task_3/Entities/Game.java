package Task_3.Entities;

public class Game {
    private int gameId;
    private String gameName;
    private String gameDetail;
    private double price;
    private int discount;

    public Game(int gameId, String gameName, String gameDetail,double price,int discount) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.gameDetail = gameDetail;
        this.price = price;
        this.discount = discount;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameDetail() {
        return gameDetail;
    }

    public void setGameDetail(String gameDetail) {
        this.gameDetail = gameDetail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
