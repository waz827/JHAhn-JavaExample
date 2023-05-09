package java0502.template2;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("ㅈㄴ빠름");
    }

    @Override
    public void jump() {
        System.out.println("ㅈㄴ높음 jump");
    }

    @Override
    public void turn() {
        System.out.println("마르세유턴");
    }

    @Override
    public void showLevel() {
        System.out.println("===== 고인물 =====");
    }
}
