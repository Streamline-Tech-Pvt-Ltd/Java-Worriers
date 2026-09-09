package com.main.Exception;

interface Vehicle {

    interface Engine {
        void start();
    }
}

class Car implements Vehicle.Engine {

    @Override
    public void start() {
        System.out.println("Car engine started");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle.Engine e = new Car();
        e.start();
    }
}
