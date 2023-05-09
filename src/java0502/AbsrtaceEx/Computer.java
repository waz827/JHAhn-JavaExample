package java0502.AbsrtaceEx;

// 추상클래스는 구현을 하지못함. 선언만 가능하다.
public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    public void turnOn(){
        System.out.println(" Power On");
    }
    public void turnOff(){
        System.out.println("Power Off");
    }
}
