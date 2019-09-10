package com.stackroute.springdemo;

public class Airtel implements Sim{

    @Override
    public void calling() {
        System.out.println("Calling from airtel");
    }

    @Override
    public void data() {
        System.out.println("Data signals are quite fast");
    }
}
