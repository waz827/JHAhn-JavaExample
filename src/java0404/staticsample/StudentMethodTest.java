package java0404.staticsample;

public class StudentMethodTest {
    public static void main(String[] args) {
        StudentMethod studentL = new StudentMethod();
        studentL.setStudentName("이");
        System.out.println(StudentMethod.getSerialNum());
        System.out.println(studentL.getStudentName()+"학번: "+studentL.studentId);

        StudentMethod studentH= new StudentMethod();
        studentH.setStudentName("홍");
        System.out.println(StudentMethod.getSerialNum());
        System.out.println(studentH.getStudentName()+"학번: "+studentH.studentId);
    }
}
