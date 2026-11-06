package example.singleton;

/* 
Реализация синглтона настроек магазина через enum согласно заданию.
Должен хранить: название магазина, адрес сервера, режим тех. обслуживания.
*/
public enum ShopConfig {
    INSTANCE;
    
    private  String shopName = "Крутой Магазин";
    private String serverAddress = "https;//крутойМагазин.com";
    private boolean texObslyzj = false;

    // геттеры и сеттеры дял управления насройками
    public String getShopName(){return shopname;}
    public void setShopName(String shopName) { this.shopName = shopName;}

    public String getServerAddress() { return serverAddress; }
    public void setServerAddress(String serverAddress) { this.serverAddress = serverAddress; }

    public boolean isTexObslyzj() { return texObslyzj; }
    public void setTexObslyzj(boolean texObslyzj) { this.texObslyzj = texObslyzj; }

    @Override 
    public String toString() {
        return "ShopConfig{" +
                "Название='" + shopName + '\'' +
                ", Аддресс='" + serverAddress + '\'' +
                ", Статус тех обслуживания=" + texObslyzj +
                '}';
    }
}