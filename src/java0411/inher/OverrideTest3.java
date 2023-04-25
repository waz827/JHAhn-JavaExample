package java0411.inher;

import java0425.Customer;
import java0425.CustomerVip;

public class OverrideTest3 {
    public static void main(String[] args) {
        int price=10000;
        Customer customerL = new Customer(10010,"Lee");
        System.out.println(customerL.getCustomerName()+" 님이 지불해야하는 금액은"+ customerL.calPrice(price)+ " 원 입니다");

        CustomerVip vipK =new CustomerVip(10020,"Kim",11111);
        System.out.println(vipK.getCustomerName()+" 님이 지불해야하는 금액은"+ vipK.calPrice(price)+ " 원 입니다");

        Customer vc= new CustomerVip(10010,"zz",2000);
        System.out.println(vc.getCustomerName()+"님이 지불해야하는 금액은"+vc.calPrice(price)+"원 입니다");
    }
}
