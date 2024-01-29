package newExample;

public class Customer {
    private String name;
    private String SurName;
    private String email;

    private double money;

    public Customer(String name, String surName, String email, double money) {
        this.name = name;
        this.SurName = surName;
        this.email = email;
        this.money = money;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        this.SurName = surName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

