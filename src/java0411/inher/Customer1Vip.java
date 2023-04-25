package java0411.inher;
public class Customer1Vip extends Customer1 {
    private int agentId;
    double saleRatio;
    public Customer1Vip(){
        customerGrade= "VIP";
        bonusRatio= 0.05;
        saleRatio=0.1;
    }
    public Customer1Vip(int customerID, String customerName, int agentId){
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
