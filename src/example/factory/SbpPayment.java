package example.factory;

public class SbpPayment implements Payment {
    @Override 
    public void pay(double amount){
        System.out.println("Оплата картой: Успешно списано " + amount + " руб.");
    }
    
}
