package com.strategy.samples.strategy;

public class StrategyGun implements Strategy{
    @Override
    public void runStrategy() {
        System.out.println("탕!");
    }
}
