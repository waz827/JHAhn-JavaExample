package java0314;

public class SwitchCase {
    public static void intCase(int ranking){
        char medalColor;
        switch (ranking){
            case 1:medalColor='G';
                break;
            case 2:medalColor='S';
                break;
            case 3:medalColor='B';
                break;
            default:medalColor='A';
        }
        System.out.println(ranking + "메달의 색은" + medalColor +"인데요");
    }
    public static void main(String[] args) {
        int ranking=1;
        String madal = "Gold";
        intCase(ranking);

        int month =3;
        int day = 5;
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: day=31;
                break;
            case 4: case 6: case 9: case 11: day=30;
                break;
            case 2: day=28;
                break;
        }
        System.out.println(day);
    }
}
