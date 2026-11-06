package example.prototype;

public class Product  implements Cloneable {
    /* 
    TODO: Добавить поля:
    - String name
    - double price
    - String category
    
    Реализовать метод/интерфейс для клонирования товара.
    */
    private String name;
    private double price;
    private final String category;

    public Product(String name, double price, String category) {
       this.name = name;
       this.price = price;
       this.category = category;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }



   @Override
    @SuppressWarnings("CloneDeclaresCloneNotSupported")// я не знаю что дает эта строчка добавил потому что вс код жаловался 
   public Product clone() {
       try {
           return (Product) super.clone();
       } catch (CloneNotSupportedException e) {
           throw new AssertionError();
       }
   }
   @Override 
   public String toString(){
    return "Product{name='" + name + "', price=" + price + ", category='" + category + "'}";
   }
}