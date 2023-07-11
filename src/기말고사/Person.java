package 기말고사;

public class Person {
    private String Name;


    public Person(){}

    public Person(String Name){

        this.Name= Name;
    }

    public String getName() {
        return this.Name;
    }

    public void setBookName(String Name) {
        this.Name = Name;
    }


    public boolean showInfo(){
        System.out.println(Name);
        return false;
    }
}
