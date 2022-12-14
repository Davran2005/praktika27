package classes;

public class Person {
    private String name;
    private int bancAccount;

    public Person(String name, int bancAccount) {
        this.name = name;
        this.bancAccount = bancAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBancAccount() {
        return bancAccount;
    }

    public void setBancAccount(int bancAccount) {
        this.bancAccount = bancAccount;
    }

    @Override
    public String toString() {
        return
                "\nNAME : " + name + '\'' +
                        "\nPRICE : " + bancAccount;

    }
}
