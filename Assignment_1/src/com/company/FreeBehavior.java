package com.company;

public class FreeBehavior implements MoneyBehavior{
    @Override
    public void travelCost() {
        System.out.println("Do not need to spend money, it is free");
    }
}
