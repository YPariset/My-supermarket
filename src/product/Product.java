package product;

public class Product {
    private String product;
    private int quantity;
    private float price;

    public Product( String product, int quantity, float price ) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() { return product; }
    public void setProduct( String product ) { this.product = product; }

    public int getQuantity() { return quantity; }
    public void setQuantity( int quantity ) { this.quantity = quantity; }

    public float getPrice() { return price; }
    public void setPrice( float price ) { this.price = price; }
}
