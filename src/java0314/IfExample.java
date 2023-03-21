package java0314;

public class IfExample {
    public static void onlyif(int age){
        int age1=8;
        int charge;
        if(age1<8){
            charge=1000;
            System.out.println("미취학 아동입니다.");
        }
        else if (age1<14) {
            charge=2000;
            System.out.println("초등학생입니다.");
        }
        else if(age1<20){
            charge=3000;
            System.out.println("중고등학생입니다.");
        }
        else{
            charge=4000;
        }
        System.out.println(charge + "입니다");
    }
    public static void main(String[] args) {
        int age=9;
        int charge;

        if(age<8){
          charge=1000;
            System.out.println("미취학 아동입니다.");
        }
        else if (age<14) {
            charge=2000;
            System.out.println("초등학생입니다.");
        }
        else if(age<20){
            charge=3000;
            System.out.println("중고등학생입니다.");
        }
        else{
            charge=4000;
        }
        System.out.println(charge + "입니다");

        onlyif(age);
    }
}
