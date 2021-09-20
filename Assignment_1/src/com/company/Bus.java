package com.company;

public class Bus extends Transport{
    public Bus() {
        super(new LongTimeBehavior(), new CheapBehavior());
    }
}
