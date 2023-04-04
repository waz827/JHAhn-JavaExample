package java0404;

public class StudentTest {
    public static void main(String[] args) {
        
        Student student= new Student();
        student.studentName="홍길동";
        System.out.println(student.getStudentName());

        Student student2= new Student();
        student2.studentName="세종대왕";
        System.out.println(student2.getStudentName());

        System.out.println(student);
        System.out.println(student2);


    }
}
