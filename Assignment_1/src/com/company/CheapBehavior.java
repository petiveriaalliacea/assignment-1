package com.company;

public class CheapBehavior implements MoneyBehavior{
    @Override
    public void travelCost() {
        System.out.println("Price is cheap");
    }
}
