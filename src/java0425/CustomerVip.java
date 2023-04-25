package java0425;

public class CustomerVip extends Customer{
    private int agentId;
    double saleRatio;
    public CustomerVip(){
        customerGrade= "VIP";
        bonusRatio= 0.05;
        saleRatio=0.1;
    }
    public CustomerVip(int customerID, String customerName, int agentId){
        super(customerID, customerName);
        customerGrade="VIP";
        bonusRatio= 0.05;
        saleRatio=0.1;
    }

    public int getAgneId() {
        return agentId;
    }

    @Override
    public int calPrice(int price) {
        bonusPoint += price *bonusRatio;
        return price -(int)(price * saleRatio);
    }


}
