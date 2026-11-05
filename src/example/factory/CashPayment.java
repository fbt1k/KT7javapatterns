package example.factory;

public class CashPayment implements  Payment { 
    @Override 
    public void  pay(double amount){
        System.out.println("Оплата наличными: Успешно списано " + amount + " руб.");
    }
    
}
