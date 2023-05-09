package java0502.template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("===== Auto Drive =====");
        Car myCar= new AIcar();
        myCar.run();

        System.out.println("===== Human Drive =====");
        Car Hcar= new ManualCar();
        Hcar.run();
    }
}
