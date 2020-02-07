package com.interviewdot.TapInterface;

public class SilverTap implements Tap {
    @Override
    public void fix() {
        System.out.println("SilverTap - fixed");
    }

    @Override
    public void unPlug() {
        System.out.println("SilverTap - unPlugged");
    }

    @Override
    public void tapOpen() {
        System.out.println("SilverTap - opened");
    }

    @Override
    public void tapClose() {
        System.out.println("SilverTap - closed");
    }
}
