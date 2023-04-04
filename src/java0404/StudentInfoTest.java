package java0404;

public class StudentInfoTest {
    public static void main(String[] args) {
        StudentInfo studentInfo = new StudentInfo();

        //studentInfo.studentId=20;
        studentInfo.setStudentName("홍길동"); //private로 보호되어있는 변수에 홍길동이라는 값 입력
        System.out.println(studentInfo.getStudentName());//private로 보호되어있는 변수를 get을 통해 출력
    }
}
