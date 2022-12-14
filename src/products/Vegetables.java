package products;

import java.time.LocalDate;

public class Vegetables extends Products{
    public Vegetables(String name, int price, LocalDate localDate, String description, String madeIn) {
        super(name, price, localDate, description, madeIn);
    }
}
