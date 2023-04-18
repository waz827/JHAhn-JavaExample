package java0404.staticsample;

public class StudentNumberTest {
    public static void main(String[] args) {
        StudentNumber studentLee= new StudentNumber();
        studentLee.setStudentName("이순신");
        System.out.println(studentLee.serialNum);
        System.out.println("이름: "+studentLee.getStudentName()+"  학번: "+studentLee.studentID);

        StudentNumber studentHong= new StudentNumber();
        studentHong.setStudentName("홍길동");
        System.out.println(studentHong.serialNum);
        System.out.println("이름: "+studentHong.getStudentName()+"  학번: "+studentHong.studentID);

    }
}
