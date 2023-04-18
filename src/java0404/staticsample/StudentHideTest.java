package java0404.staticsample;

public class StudentHideTest {
    public static void main(String[] args) {
        StudentHide student1= new StudentHide();
        student1.setStudentId(19074008);
        student1.setStudentDepart("드론 로봇");
        student1.setStudentName("안장훈");
        student1.setStudentAddress("서귀포시 대포연대로 26번길 4");

        student1.getStudentAddress();

        System.out.println(student1.toString());

        StudentHide student2= new StudentHide();
        student2.setStudentName("이순신");
        System.out.println((student2.toString()));

    }
}
