package java0404.cooperation;

public class TakeTrans {
    public static void main(String[] args) {
        Student studentJames= new Student("James", 5000);
        Student studentTomas= new Student("Tomas", 5000);
        Subway subway= new Subway("1호선");
        Bus bus= new Bus(100);
        studentJames.takeBus(bus);
        studentJames.takeSubway(subway);
        studentJames.showInfo();

        studentTomas.takeBus(bus);;
        studentTomas.takeSubway(subway);
        studentTomas.showInfo();

        bus.showInfo();
        subway.showInfo();

    }
}
