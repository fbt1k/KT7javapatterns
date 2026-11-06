package example.main;

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
    }

    private static void demoFactory() {
        System.out.println("---паттерн factory method---");
        Payment payment = PaymentFactory.createPayment("card");
        payment.pay(100.0);
    }
}
