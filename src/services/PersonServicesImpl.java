package services;

import classes.Market;
import classes.Person;
import products.*;

import java.util.ArrayList;
import java.util.List;

public class PersonServicesImpl {
    List<ChildrenFood> products = new ArrayList<>();
    List<BakeryProducts> bakeryProductsList=new ArrayList<>();
    List<Seafood> seafoodList=new ArrayList<>();
    List<SportFood> sportFoodArrayList=new ArrayList<>();
    List<Vegetables> vegetables=new ArrayList<>();
    List<Integer> productSkid = new ArrayList<>();

    public String createProductChill(String product, List<ChildrenFood> products, Person person, Market market) {
        for (ChildrenFood product1 : products) {
            if (product1.getName().equals(product)) {
                if (product1.getPrice() <= person.getBancAccount()) {
                    this.products.add(product1);
                    this.productSkid.add(product1.getSkidka());
                    market.setPrice(market.getPrice() + product1.getSkidka());
                    person.setBancAccount(person.getBancAccount() - product1.getSkidka());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                } else {
                    return "У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ";
                }
            } else {
                return "НЕТ ТАКОГО ПРОДУКТА";
            }
        }
        return "ТАКОЙ ТОВАР ЕСТЬ";
    }

    public String createProductsBaker(String producte, List<BakeryProducts> products, Person person, Market market) {
        for (BakeryProducts bakeryProducts : products) {
            if (bakeryProducts.getName().equals(producte)) {
                if (bakeryProducts.getPrice() <= person.getBancAccount()) {
                    this.bakeryProductsList.add(bakeryProducts);
                    this.productSkid.add(bakeryProducts.getPrice());
                    market.setPrice(market.getPrice() + bakeryProducts.getPrice());
                    person.setBancAccount(person.getBancAccount() - bakeryProducts.getPrice());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                } else {
                    return "У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ";
                }
            } else {
                return "НЕТ ТАКОГО ПРОДУКТА";
            }
        }
        return "ТАКОЙ ТОВАР ЕСТЬ";
    }

    public String createProductsSeaFood(String product, List<Seafood> products, Person person, Market market) {
        for (Seafood product1 : products) {
            if (product1.getName().equals(product)) {
                if (product1.getPrice() <= person.getBancAccount()) {
                    market.setPrice(market.getPrice() + product1.getSkidka());
                    this.seafoodList.add(product1);
                    this.productSkid.add(product1.getSkidka());
                    person.setBancAccount(person.getBancAccount() - product1.getSkidka());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                } else {
                    return "У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ";
                }
            } else {
                return "НЕТ ТАКОГО ПРОДУКТА";
            }
        }
        return "ТАКОЙ ТОВАР ЕСТЬ";
    }

    public String createProductsSportFood(String product, List<SportFood> products, Person person, Market market) {
        for (SportFood product1 : products) {
            if (product1.getName().equals(product)) {
                if (product1.getPrice() <= person.getBancAccount()) {
                    this.sportFoodArrayList.add(product1);
                    this.productSkid.add(product1.getPrice());
                    market.setPrice(market.getPrice() + product1.getPrice());
                    person.setBancAccount(person.getBancAccount() - product1.getPrice());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                } else {
                    return "У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ";
                }
            } else {
                return "НЕТ ТАКОГО ПРОДУКТА";
            }
        }
        return "ТАКОЙ ТОВАР ЕСТЬ";
    }

    public String createProductsVegetrian(String product, List<Vegetables> products, Person person, Market market) {
        for (Vegetables product1 : products) {
            if (product1.getName().equals(product)) {
                if (product1.getPrice() <= person.getBancAccount()) {
                    this.vegetables.add(product1);
                    this.productSkid.add(product1.getPrice());
                    market.setPrice(market.getPrice() + product1.getPrice());
                    person.setBancAccount(person.getBancAccount() - product1.getPrice());
                    return "ВЫ ОТПРАВИЛИ В КОРЗИНУ ЭТОТ ТОВАР";
                } else {
                    return "У ВАС НЕ ДОСТАТОЧНО ДЕНЕГ";
                }
            } else {
                return "НЕТ ТАКОГО ПРОДУКТА";
            }
        }
        return "ТАКОЙ ТОВАР ЕСТЬ";

    }
    public List<ChildrenFood>getMyProducts(){
        return this.products;
    }
    public void check(Market market,Person person) {
        int total = 0;
        int skid = 0;
        for (Integer product : this.productSkid) {
            total += product;
        }
        for (Products products1 : products) {
            skid += products1.getPrice();
        }
        System.out.println("    ");
        System.out.println("<<<<<<<<<< CHACK GLOBUS   >>>>>>>>>");
        System.out.println("НАЗВАНИЕ МАРКЕТА : " + market.getName());
        System.out.println("ИМЯ ЧЕЛОВЕКА " + person.getName());
        System.out.println(this.products);
        System.out.println("ОБЩАЯ ЦЕНА  " + skid);
        System.out.println("ЦЕНА ПОСЛЕ СКИДКИ : " + total);
        System.out.println("    ");

    }
    }
