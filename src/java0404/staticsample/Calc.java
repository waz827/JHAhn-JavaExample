package java0404.staticsample;

public class Calc {
    public static int abs(int a){
        return a > 0 ? a : a;                  //3항연산자        //(조건) ? a : b;    조건이 맞으면 a 아니면 b
    }
    public static int max(int a, int b){
        return a > b ? a : b;
    }
    public static int min(int a, int b){
        return a < b ? a : b;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
}
