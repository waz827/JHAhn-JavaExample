package java0404;
class PersonThis{
    String name;
    int age;
    int age2;
    PersonThis(){
        this("이름이 없어요...",1);
    }
    PersonThis(String name, int age){
        this.name= name;
        this.age= age;
    }
    public void person(int i){
        this.age=i;
    }
}
public class ThisConstruct {
    public static void main(String[] args) {
        Student student = new Student();
        student.Studenti(12);
        student.SSS("ㅇ");

        PersonThis personThis = new PersonThis();
        personThis.person(7);
        System.out.println(personThis.age);
        System.out.println(student.returnS());
        System.out.println(student.returnSelf());


    }
}
