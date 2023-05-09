package java0502.template2;

public class BeginnerLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("느림");
    }
    @Override
    public void jump() {
        System.out.println("낮음 jump");
    }
    @Override
    public void turn() {
        System.out.println("어캐하누");
    }
    @Override
    public void showLevel() {
        System.out.println("===== 청정수 =====");
    }

}
