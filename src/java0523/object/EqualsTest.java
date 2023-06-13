package java0523.object;

class Student{
    int studentId;
    String studentName;
    public Student(int studentId, String studentName){
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public String toString(){
        return studentId +","+studentName;
    }
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student std = (Student) obj;
            if(studentId == std.studentId){
                return true;
            }
            else{
                return false;
            }

        }
        return false;
    }
    public int hashCode(){
        return studentId;
    }

}
public class EqualsTest {
    public static void main(String[] args) {
        Student student1= new Student(100, "Lee");
        Student student2= student1;
        Student student3= new Student(100,"Lee");

        if(student1 == student2){
            System.out.println("student1과 student2는 같습니다.");
        }
        else{
            System.out.println("student1과 student2주소가 다릅니다.");
        }
        if(student1.equals(student2)){
            System.out.println("student1과 student2는 동일하다");
        }
        else{
            System.out.println("student1과 student2는 다릅니다");
        }
        //주소는 다르지만 equals의 결과가 true인 경우


        if(student1 == student3){
            System.out.println("student1과 student3 주소는 같습니다");
        }
        else{
            System.out.println("student1과 student3 주소는 다릅니다");
        }
        System.out.println("student1의 hashCode : "+ student1.hashCode());
        System.out.println("student2의 hashCode : "+ student2.hashCode());

        System.out.println("student1의 실제주소값 : "+ System.identityHashCode(student1));
        System.out.println("student3의 실제주속값 : "+ System.identityHashCode(student2));

        if(student1.studentName == student3.studentName){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        if(student1.studentName == student3.studentName){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
