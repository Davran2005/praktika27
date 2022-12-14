package classes;

public class Market {
    private String name;
    private String description;
    private int price;
    private String phoneNumber;

    public Market(String name, String description, int price, String phoneNumber) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return  "\nNAME : " + name +
                "\nDESCRIPTION : " + description +
                "\nBANK ACCOUNT : " + price +
                "\nPHONE NUMBER : " + phoneNumber ;

    }
}
