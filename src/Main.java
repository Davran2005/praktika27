import classes.Market;
import classes.Person;
import products.*;
import services.MarketServicesAble;
import services.PersonServicesImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MarketServicesAble marketServicesAble = new MarketServicesAble();
        PersonServicesImpl personServices = new PersonServicesImpl();
        Person person = new Person("Davran ", 3000);
        Market market = new Market("ФРУНЗЕ", "МАРКЕТ", 100000, "+99623456765");
        List<BakeryProducts> bakeryProducts = new ArrayList<>(List.of(new BakeryProducts("Чёрный хлеб", 50, LocalDate.now(), "Самый вкусный хлеб", "Любимый хлеб"), new BakeryProducts("Пшеничный хлеб ", 30, LocalDate.now(), "Самый вкусный хлеб", "Любимый хлеб")));
        marketServicesAble.createBaker(bakeryProducts);
        List<ChildrenFood> childrenFoods = new ArrayList<>(List.of(new ChildrenFood("АГУША", 120, LocalDate.of(2022, 11, 4), "Каша дет. Агуша пшенич. с тыкв. 200г", "AGUSHA", 100), new ChildrenFood("ФРУТО НЯНА", 203, LocalDate.of(2022, 12, 3), "Каша дет. Фруто Няня рисовая безмолочная с 4мес 200г", "FRUTO-NYANYA", 130)));
        marketServicesAble.createChil(childrenFoods);
        List<Seafood> seafoods = new ArrayList<>(List.of(new Seafood("СКУМБРИЯ", 400, LocalDate.now(), "СКУМБРИЯ ГОРЯЧЕГО КОПЧЕНИЯ БЕЗ ГОЛОВЫ 300Г", "RUSSIA", 300), new Seafood("КРАБОВЫЕ ПАЛОЧКИ", 300, LocalDate.of(2022, 11, 6), "КРАБОВЫЕ ПАЛОЧКИ HALAL VICI 200Г", "RUSSIA", 290)));
        marketServicesAble.createSea(seafoods);
        List<SportFood> sportFoods = new ArrayList<>(List.of(new SportFood("ПРОТЕИН", 3000, LocalDate.of(2022, 4, 3), "Biotech-ISO WHEY ZERO(36 порций)", "ZERO"), new SportFood("КРЕАТИН", 4000, LocalDate.of(2022, 3, 3), "Увеличение силы и выносливости", "ZERO")));
        marketServicesAble.crateSport(sportFoods);
        List<Vegetables> vegetables = new ArrayList<>(List.of(new Vegetables("БАНАН", 30, LocalDate.now(), "Фрукт", "АФРИКА"), new Vegetables("ЯБЛОКО", 20, LocalDate.now(), "Красное яблоко", "КУРБУ")));
        marketServicesAble.crateVegatrian(vegetables);

        while (true) {
            System.out.println("       <<<<<<>>>>>>> ФРУНЗЕ <<<<<<<>>>>>>");
            System.out.println("НАЖМИ 1 ЧТОБЫ ЗАЙТИ В РАЗДЕЛ ХЛЕБА");
            System.out.println("НАЖМИ 2 ЧТОБЫ ЗАЙТИ В РАЗДЕЛ ДЕТСКОГО ПИТАНИЯ ");
            System.out.println("НАЖМИ 3 ЧТОБЫ ЗАЙТИ В РАЗДЕЛ МОРЕ ПРОДУКТА ");
            System.out.println("НАЖМИ 4 ЧТОБЫ ЗАЙТИ В РАЗДЕЛ СПОРТИВНОГО ПИТАНИЯ ");
            System.out.println("НАЖМИ 5 ЧТОБЫ ЗАЙТИ В ОВОШНОЙ РАЗДЕЛ ");
            System.out.println("НАЖМИ 6 ЧТОБЫ ПОСМОТРЕТЬ ВСЕ МОЙ ПРОДУКТЫ ");
            System.out.println("НАЖМИ 7 ЧТОБЫ КУПИТЬ ВСЕ ЧТО ВЫБРАЛ И ПОЛУЧИТЬ ЧЕК");
            System.out.println("НАЖМИ 8 ЧТОБЫ ПОЛУЧИТЬ ВСЮ ИНФОРМАЦИЮ О ПОКУПАТЕЛЕ");
            System.out.println("НАЖМИ 9 ЧТОБЫ ПОЛУЧИТЬ ВСЮ ИНФОРМАЦИЮ О МАРКЕТЕ");
            System.out.println("   ");
            System.out.print("НАЖМИ : ");
            int swith = scanner.nextInt();
            switch (swith) {
                case 1:
                    System.out.println(marketServicesAble.getAllBakeryProducts());
                    String b = scanner.nextLine();
                    System.out.println("       ");
                    System.out.print("НАЗВАНИЕ ПРОДУКТА : ");
                    String name = scanner.nextLine();
                    System.out.println(personServices.createProductsBaker(name.toUpperCase(), marketServicesAble.getAllBakeryProducts(), person, market));
                    break;
                case 2:
                    System.out.println(marketServicesAble.getAllChildrenFoods());
                    String b1 = scanner.nextLine();
                    System.out.println("        ");
                    System.out.print("НАЗВАНИЕ ПРОДУКТА : ");
                    String nb = scanner.nextLine();
                    System.out.println(personServices.createProductChill(nb.toUpperCase(), marketServicesAble.getAllChildrenFoods(), person, market));
                    break;
                case 3:
                    System.out.println(marketServicesAble.getAllSeaFood());
                    String b2 = scanner.nextLine();
                    System.out.println("       ");
                    System.out.print("НАЗВАНИЕ ПРОДУКТА : ");
                    String nb1 = scanner.nextLine();
                    System.out.println(personServices.createProductsSeaFood(nb1.toUpperCase(), marketServicesAble.getAllSeaFood(), person, market));
                    break;
                case 4:
                    System.out.println(marketServicesAble.getAllSport());
                    String n = scanner.nextLine();
                    System.out.println("       ");
                    System.out.print("НАЗВАНИЕ ПРОДУКТА : ");
                    String nb12 = scanner.nextLine();
                    System.out.println(personServices.createProductsSportFood(nb12.toUpperCase(), marketServicesAble.getAllSport(), person, market));
                    break;
                case 5:
                    System.out.println(marketServicesAble.getAllVegatrian());
                    String n1 = scanner.nextLine();
                    System.out.println("       ");
                    System.out.print("НАЗВАНИЕ ПРОДУКТА : ");
                    String nw = scanner.nextLine();
                    System.out.println(personServices.createProductsVegetrian(nw.toUpperCase(), marketServicesAble.getAllVegatrian(), person, market));
                    break;
                case 6:
                    System.out.println("<<<<< ВСЕ МОЙИ ПРОДУКТЫ  >>>>>");
                    System.out.println(personServices.getMyProducts());
                    break;
                case 7:
                    personServices.check(market, person);
                    break;
                case 8:
                    System.out.println(person);
                    break;
                case 9:
                    System.out.println(market);
                    break;
                default:
                    System.err.println("НЕ ПРАВИЛЬНАЯ КОМБИНАЦИЯ");


            }


        }

    }
}
