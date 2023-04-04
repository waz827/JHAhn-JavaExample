package java0321;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public void setDay(int day){
        if(month==2){
            if(day<1 || day>28){
                System.out.println("날짜형식 안맞다고");
            }
            else {
                this.day=day;
            }
        }
        if(day>31){
            System.out.println("왜 31일이 넘어가냐고");
        }
    }
    public int getDay(){
        return this.day;
    }

    public int getMonth() {
        return month;
    }
}
