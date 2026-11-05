package example.factory;

public interface Payment {
    /* 
    Метод для проведения платежа.
    amount - сумма, которую нужно списать.
    */
    void pay(double amount);
}