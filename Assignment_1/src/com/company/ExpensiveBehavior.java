package com.company;

public class ExpensiveBehavior implements MoneyBehavior{
    @Override
    public void travelCost() {
        System.out.println("Price is expensive");
    }
}
