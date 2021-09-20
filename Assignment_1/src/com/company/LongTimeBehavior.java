package com.company;

public class LongTimeBehavior implements TimeBehavior{

    @Override
    public void arriveTime() {
        System.out.println("Takes minimum time to get to the point");
    }
}
