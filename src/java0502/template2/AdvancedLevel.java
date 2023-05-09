package java0502.template2;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빠름");
    }

    @Override
    public void jump() {
        System.out.println("높음 jump");
    }

    @Override
    public void turn() {
        System.out.println("일단 돌아봄");
    }

    @Override
    public void showLevel() {
        System.out.println("===== 중급자 =====");
    }
}
