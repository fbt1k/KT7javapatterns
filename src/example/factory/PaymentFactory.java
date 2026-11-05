package example.factory;

public class PaymentFactory {
    public static Payment createPayment(String type) {
       if (type == null) {
            return null;
       }
       return switch (type.toLowerCase()) {
            case "cash" -> new CashPayment();
            case "card" -> new CardPayment();
            case "sbp" -> new SbpPayment();
            default -> throw new IllegalArgumentException("Неизвестный способ оплаты: " + type);

        };
    }

    
}
