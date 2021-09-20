package com.company;

public class Main {

    public static void main(String[] args) {
        Transport taxi = new Taxi();
        System.out.println("Taxi used to:");
        taxi.spendMoney();
        taxi.spendTime();

        taxi.setMoney(new CheapBehavior());

        System.out.println("Now:");
        taxi.spendMoney();
        taxi.spendTime();
    }
}
