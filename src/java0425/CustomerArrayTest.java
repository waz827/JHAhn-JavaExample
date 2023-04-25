package java0425;

import java.util.ArrayList;

public class CustomerArrayTest {
    public static void main(String[] args) {
        //배열은 초기화를 할때 배열의 크기를 설정해줘야 한다. 하지만 arraylist는 크기를 설정해줄 필요가없다.

        ArrayList<Customer> customerList= new ArrayList<>();        //<>안에 클래스명이 들어갈수도있고 자료형이 들어갈수도있다.
        ArrayList<Integer> ii= new ArrayList<>();
        int i[]= new int[10];

        Customer customer1= new Customer(10010,"A");
        Customer customer2= new Customer(10020,"B");
        Customer customer3= new Customer(10030,"C");
        Customer customer4= new Customer(10040,"D");
        Customer customer5= new CustomerVip(10050,"E", 11111);

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);
        customerList.add(customer4);
        customerList.add(customer5);

        System.out.println("===== customer info =====");
        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }
        // for(int i=0; i<10; i++){} == for(Integer i : ii){}
        System.out.println("size= "+ customerList.size());
        System.out.println("size= "+ customerList.get(1).showCustomerInfo());
    }
}
