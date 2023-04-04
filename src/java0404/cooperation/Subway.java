package java0404.cooperation;

public class Subway {
    String lineNumber;
    int money;
    int passgerCount;
    public Subway(String lineNumber){
        this.lineNumber= lineNumber;
    }
    public void take(int money){
        ++passgerCount;
        this.money= money*passgerCount;

    }
    public void showInfo(){
        System.out.println("지하철"+lineNumber+"의 승객은"+passgerCount+
                "명이고, 수입은"+money+"개꿀!");
    }
}
