package 기말고사;

public class GoodCalc extends Calculator{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] a) {
        int total=0;
        for(int i:a){
            total+=i;
        }
        int finish=total/3;
        return finish;
    }
}
