package java0411.inher;

import java0425.Customer;
import java0425.CustomerVip;

public class OverrideTest2 {
    public static void main(String[] args) {
        Customer vc = new CustomerVip(10010,"zz",20000);
        //vc.bonusPoint=1000;
        // 선언한 클래스형이 아닌 생성된 인스턴스의 메서드 호출
        // 인스턴스 메서드가 호출되는 기술 : 가상 메서드
        System.out.println(vc.getCustomerName()+"님이 지불해야하는 금액은"+vc.calPrice(10000)+"입니다");
    }
}
