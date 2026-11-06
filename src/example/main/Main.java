package example.main;
import example.abstractFactory.Button;
import example.abstractFactory.TextField;
import example.abstractFactory.UIFactory;
import example.abstractFactory.dark.DarkUIFactory;
import example.factory.Payment;
import example.factory.PaymentFactory;
import example.prototype.Product;

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
       demoPrototype();
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

    private static void demoPrototype(){
        System.out.println("\n---паттерн prototype---");

        Product original = 
            new Product( "iphone", 999999, "phone");
        
        Product copy = original.clone();

        copy.setName("android");
        copy.setPrice(1000);
        
        System.out.println("Оригинал: " + original);
        System.out.println("Копия: " + copy);        
    }


}
