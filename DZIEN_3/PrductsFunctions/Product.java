public class Product {
    private String name;
    private double price;
    private boolean onSale;

    public Product(String name, double price, boolean onSale) {
        this.name = name;
        this.price = price;
        this.onSale = onSale;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    @Override
    public String toString() {
        return "Product {name =" + name+ ", price =" + price + ", onSale = " + onSale +"}";
    }
}
