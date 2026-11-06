package example.main;
import example.abstractFactory.Button;
import example.abstractFactory.TextField;
import example.abstractFactory.UIFactory;
import example.abstractFactory.dark.DarkUIFactory;
import example.factory.Payment;
import example.factory.PaymentFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Тестирование интернет-магазина ===");
        
        /* 
        TODO: Поочередно вызвать и продемонстрировать работу:
        1. Factory Method (выбор Card/Sbp/Cash)
        2. Abstract Factory (смена Light/Dark тем)
        3. Prototype (копирование товара и проверка оригинала)
        4. Builder (пошаговое создание Order)
        5. Singleton (проверка уникальности экземпляра ShopConfig)
        */
       demoFactory();
       demoAbstractFactory();
    }

    private static void demoFactory() {
        System.out.println("\n---паттерн factory method---");
        
        Payment payment = PaymentFactory.createPayment("card");
        payment.pay(100.0);
    }

    private static void demoAbstractFactory() {
        System.out.println("\n---паттерн abstract factory---");
        
        UIFactory factory = new DarkUIFactory();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();

        button.render();
        textField.render();
    }

}
