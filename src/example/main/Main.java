package example.main;

import example.abstractFactory.Button;
import example.abstractFactory.TextField;
import example.abstractFactory.UIFactory;
import example.abstractFactory.dark.DarkUIFactory;
import example.builder.Order;
import example.factory.Payment;
import example.factory.PaymentFactory;
import example.prototype.Product;
import example.singleton.ShopConfig;

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
        demoBuilder();
        demoSingleton();
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

    private static void demoPrototype() {
        System.out.println("\n---паттерн prototype---");

        Product original
                = new Product("iphone", 999999, "phone");

        Product copy = original.clone();

        copy.setName("android");
        copy.setPrice(1000);

        System.out.println("Оригинал: " + original);
        System.out.println("Копия: " + copy);
    }

    private static void demoBuilder() {
        System.out.println("\n---паттерн builder---");

        Order order = new Order.Builder()
                .cusromerName("вася")
                .address("деревня")
                .product("питбайк")
                .quantity(1)
                .comment("от джавы таких эмоций не получить")
                .build();

        System.out.println(order);
    }

    private static void demoSingleton() {
        System.out.println("\n---паттерн singleton---");

        //имитация обращениий вразных метсах
        ShopConfig config1 = ShopConfig.INSTANCE;
        ShopConfig config2 = ShopConfig.INSTANCE;

        System.out.println("config1 == config2: " + (config1 == config2));
        config1.setShopName("Магазин питбайков");
        config1.setServerAddress("https://питбайккупить.com");
        
        System.out.println("\nconfig1: " + config1);
        System.out.println("config2: " + config2);
        System.out.println("\nизменения успешно применены");
    }
}
