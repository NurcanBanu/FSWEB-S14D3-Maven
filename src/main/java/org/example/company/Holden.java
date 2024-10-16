package org.example.company;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return getName() + " is braking";
    }

    @Override
    public String accelerate() {
        return getName() + " is accelerating";
    }

    @Override
    public String startEngine() {
        return getName() + "'s engine is starting";
    }
}
