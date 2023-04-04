package java0404;

public class PersonTest {
    public static void main(String[] args) {
        Person person= new Person();
        person.name="김유신";
        person.height=180.0f;
        person.weight= 85.5f;
        System.out.println(person.name);

        Person personKim= new Person("김춘추");
        System.out.println(personKim.name);
        Person personLee= new Person("이순신", 180, 80.1f);
        System.out.println(personLee.name);

    }
}
