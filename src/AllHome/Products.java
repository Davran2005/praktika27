package AllHome;

public class Products {  private String name;
    private int price;
    private String description;
    private String madeIn;

    public Products(String name, int price, String description, String madeIn) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.madeIn = madeIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public String toString() {
        return "HouseholdProducts{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", madeIn='" + madeIn + '\'' +
                '}';
    }

}
