package section16_abstract_class_in_oop;


abstract class Vehicle
{
    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();
    public abstract void brake();
}

class Car extends Vehicle
{

    @Override
    public void start() {
        System.out.println("Car's Engined Is Started");
    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate() {

    }

    @Override
    public void brake() {

    }
}


public class Example6 {
}
