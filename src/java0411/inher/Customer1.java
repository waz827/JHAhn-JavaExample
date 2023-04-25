package java0411.inher;

public class Customer1 {
    private int customerId;
    private String customerName;
    protected String customerGrade;
    protected int bonusPoint;
    double bonusRatio;

    public Customer1(){
        customerGrade= "SILVER";
        bonusRatio=0.01;
    }
    public Customer1(int customerId, String customerName){
        this.customerId= customerId;
        this.customerName= customerName;
        customerGrade= "SILVER";
        bonusRatio=0.01;
    }
    public int calPrice(int price){
        bonusPoint+=price*bonusRatio;
        return price;
    }
    public String showCustomerInfo(){
        return customerName+"의 등급은 "+customerGrade+" 이며, 보너스 포인트는 "+bonusPoint+" 입니다";
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
