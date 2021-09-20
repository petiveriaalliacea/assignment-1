package com.company;

public class Walk extends Transport{
    public Walk() {
        super(new LongTimeBehavior(), new FreeBehavior());
    }
}
