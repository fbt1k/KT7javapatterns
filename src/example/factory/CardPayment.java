package example.factory;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        // Реализация платежа с использованием карты
        System.out.println("Оплата картой на сумму: " + amount);
    }
    
}
