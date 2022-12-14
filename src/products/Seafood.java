package products;

import java.time.LocalDate;

public class Seafood extends Products{
    private int skidka;

    public Seafood(String name, int price, LocalDate localDate, String description, String madeIn, int skidka) {
        super(name, price, localDate, description, madeIn);
        this.skidka = skidka;
    }

    public int getSkidka() {
        return skidka;
    }

    public void setSkidka(int skidka) {
        this.skidka = skidka;
    }
}
