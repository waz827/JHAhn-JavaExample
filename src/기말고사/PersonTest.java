package 기말고사;



public class PersonTest {
    public static void main(String[] args) {
        Person[] people=new Person[5];
        people[0]=new Person("제임스 고슬링");
        people[1]=new Person("안장훈");
        people[2]=new Person("귀도 반 로섬");
        people[3]=new Person("제갈공명");
        people[4]=new Person("권율");

        for(int i =0; i< people.length; i++){
            people[i].showInfo();
        }
    }
}
