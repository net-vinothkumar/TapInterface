package com.interviewdot.TapInterface;

public class PlasticTap implements Tap {
    @Override
    public void fix() {
        System.out.println("Plastic - fixed");
    }

    @Override
    public void unPlug() {
        System.out.println("Plastic - unPlugged");
    }

    @Override
    public void tapOpen() {
        System.out.println("Plastic - opened");
    }

    @Override
    public void tapClose() {
        System.out.println("Plastic - closed");
    }
}
