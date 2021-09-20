package com.company;

public abstract class Transport {

    TimeBehavior time;
    MoneyBehavior money;

    public Transport(TimeBehavior timeBehavior, MoneyBehavior moneyBehavior) {
        this.time = timeBehavior;
        this.money = moneyBehavior;
    }

    public void spendTime(){
        time.arriveTime();
    }

    public void spendMoney(){
        money.travelCost();
    }

    public void setTime(TimeBehavior time) {
        this.time = time;
    }

    public void setMoney(MoneyBehavior money) {
        this.money = money;
    }
}
