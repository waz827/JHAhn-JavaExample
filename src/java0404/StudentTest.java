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

        StudentScore studentScore = new StudentScore();
        studentScore.studentName="김길동";
        // studentScore.korean.score= 100;
        // studentScore.korean.subjectName="국어";

        // studentScore.math.score=80;

        Subject subject = new Subject();
        subject.score=100;
        subject.subjectName="국어";

        System.out.println(subject.subjectName);

        studentScore.korean= subject;

        System.out.println(studentScore.korean.subjectName);

        //studentCourse.korean.subjectName="국어";

    }
}
