package java0509;

public class CompleteCalc extends Calculator{


    @Override
    public int times(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divide(int num1, int num2) {
//        if(num2!=0)
//            return num1/num2;
//        else
//            return 0;
        num1=0;
        return num1/num2;
//        return num2 !=0 ? num1/num2:0; //3항 연산자
    }
    public void showInfo(){
        System.out.println("Cal Interface is Working");
    }
    public void description(){
        super.description();
    }
}
