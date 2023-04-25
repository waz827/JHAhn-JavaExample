package java0425;
class Animal{
    public void move(){
        System.out.println("Movement");
    }
}
class Human extends Animal{
    @Override
    public void move() {
        System.out.println("Human is Walking");
    }
}
class Tiger extends Animal{
    @Override
    public void move() {
        System.out.println("Tiger is Walking");
    }
}
class Eagle extends Animal{
    @Override
    public void move() {
        System.out.println("Eagle is flying");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animalTest= new AnimalTest();
//        Animal animal= new Human();
//        animalTest.moveAnimal(new Human());

        animalTest.moveAnimal(new Human());
        animalTest.moveAnimal(new Tiger());
        animalTest.moveAnimal(new Eagle());

    }
    public void moveAnimal(Animal animal){
        // 선언한 클래스형이 아닌 생성된 인스턴스의 매서드 호출 : virtual method
        animal.move();
    }
}
