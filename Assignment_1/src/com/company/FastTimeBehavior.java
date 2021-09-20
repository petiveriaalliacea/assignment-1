package com.company;

public class FastTimeBehavior implements TimeBehavior{
    @Override
    public void arriveTime(){
        System.out.println("Takes a long time to get to the point");
    }
}
