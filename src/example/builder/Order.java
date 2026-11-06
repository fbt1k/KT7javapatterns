package example.builder;


public class Order {

    private String customerName;
    private String address;
    private String product;
    private int quantity;
    private String comment;

    private Order(Builder builder) {
        this.customerName = builder.customerName;
        this.address = builder.address;
        this.product = builder.product;
        this.quantity = builder.quantity;
        this.comment = builder.comment;
    }

    @Override
    public String toString() {
        return "Order{"
                + "customerName='" + customerName + '\''
                + ", address='" + address + '\''
                + ", product='" + product + '\''
                + ", quantity=" + quantity
                + ", comment='" + comment + '\''
                + '}';
    }
    // вложенныйы статик класс билдер
    public static class Builder {

        private String customerName;
        private String address;
        private String product;
        private int quantity;
        private String comment;

        public Builder cusromerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder product(String product) {
            this.product = product;
            return this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

}
