package classes;

public class BancAccount {
    private int price;
    private String paswword;

    public BancAccount(int price, String paswword) {
        this.price = price;
        this.paswword = paswword;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPaswword() {
        return paswword;
    }

    public void setPaswword(String paswword) {
        this.paswword = paswword;
    }

    @Override
    public String toString() {
        return "BancAccount{" +
                "price=" + price +
                ", paswword='" + paswword + '\'' +
                '}';
    }
}
