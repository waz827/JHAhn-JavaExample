package java0502.AbsrtaceEx;
//추상클래스를 상속받을때는 구현{}을 꼭 해주어야 한다.
public class Desktop extends Computer {
    @Override
    public void display() {

    }
    @Override
    public void typing() {

    }
    @Override
    public void turnOff() {
        super.turnOff();
    }
    @Override
    public void turnOn() {
        super.turnOn();
    }
}
