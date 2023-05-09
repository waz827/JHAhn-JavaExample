package java0502.template;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("Human Driving");
        System.out.println("Human Handle Control");
    }

    @Override
    public void stop() {
        System.out.println("Break Stop");
    }
}
