package java0502.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public void startCar(){
        System.out.println("Start Car");
    }
    public void stopCar(){
        System.out.println("Stop Car");
    }

    final public void run(){
        startCar();
        drive();
        stop();
        stopCar();
    }
}
