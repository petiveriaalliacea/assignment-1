package com.company;

public class Taxi extends Transport{
    public Taxi() {
        super(new FastTimeBehavior(), new ExpensiveBehavior());
    }
}
