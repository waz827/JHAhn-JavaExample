package java0404;

public class Student {

    private int studentId;
    private String studentName;
    String grade;

    public  void Studenti(int i){
        this.studentId = i;
    }
    public void SSS(String a){
        this.studentName = a;
    }
    public String returnS(){
        return this.studentName;
    }
    public int returnSelf(){
        return this.studentId;
    }
    public String getStudentName(){
        return  studentName;
    }
    public void setStudentName(String name){ //this.studentName << 이클래스(Student)에 대한 변수이다
        this.studentName= name;
    }
    public static void main(String[] args) {
        Student student= new Student(); //디폴트 생성자가 만들어짐.
        student.studentName= "홍";

        System.out.println(student.studentName);
        System.out.println(student.getStudentName());
        }
    }
