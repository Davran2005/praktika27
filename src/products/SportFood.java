package products;

import java.time.LocalDate;

public class SportFood extends Products{
    public SportFood(String name, int price, LocalDate localDate, String description, String madeIn) {
        super(name, price, localDate, description, madeIn);
    }
}
