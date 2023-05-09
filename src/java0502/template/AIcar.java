package java0502.template;

public class AIcar extends Car {
    @Override
    public void drive() {
        System.out.println("Auto Driving");
        System.out.println("Auto Handle Control");
    }

    @Override
    public void stop() {
        System.out.println("Auto Stop");
    }
}
