package java0425;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer1= new Customer();
        customer1.setCustomerId(10010);
        customer1.setCustomerName("Lee");
        customer1.bonusPoint=1000;

        System.out.println(customer1.showCustomerInfo());

        Customer customer2= new CustomerVip(10020,"Kim",11111);
        customer2.bonusPoint=1000;
        System.out.println(customer2.showCustomerInfo());

        System.out.println("============================할인율과 보너스 포인트 계산================================");

        int price= 10000;
        int price1= customer1.calPrice(price);
        int price2= customer2.calPrice(price);

        System.out.println(customer1+"님이 지불하실 금액은"+price1+"원 입니다");
        System.out.println(customer1.showCustomerInfo());
        System.out.println(customer2+"님이 지불하실 금액은"+price2+"원 입니다");
        System.out.println(customer2.showCustomerInfo());
    }
}
