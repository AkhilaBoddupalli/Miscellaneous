package com.stackroute.springdemo;


    public class Vodaphone implements Sim{

        @Override
        public void calling() {
            System.out.println("Calling from vodaphone");
        }

        @Override
        public void data() {
            System.out.println("Data signals are bt slow");
        }
    }

