package products;

import java.time.LocalDate;

public class BakeryProducts extends Products{
    public BakeryProducts(String name, int price, LocalDate localDate, String description, String madeIn) {
        super(name, price, localDate, description, madeIn);
    }
}
