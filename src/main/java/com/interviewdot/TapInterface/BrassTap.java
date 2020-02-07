package com.interviewdot.TapInterface;

public class BrassTap implements Tap {
    @Override
    public void fix() {
        System.out.println("BrassTap - fixed");
    }

    @Override
    public void unPlug() {
        System.out.println("BrassTap - unPlugged");
    }

    @Override
    public void tapOpen() {
        System.out.println("BrassTap - opened");
    }

    @Override
    public void tapClose() {
        System.out.println("BrassTap - closed");
    }
}
