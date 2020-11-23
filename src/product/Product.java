package product;

public class Product {

    /****************************************************/
    /***********           Attributes         ***********/
    /****************************************************/

    private String product;
    private int quantity;
    private float price;

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Product( String product, int quantity, float price ) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/


    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/

    public String getProduct() { return product; }

    public int getQuantity() { return quantity; }

    public float getPrice() { return price; }

    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/


    public void setProduct( String product ) { this.product = product; }

    public void setQuantity( int quantity ) { this.quantity = quantity; }

    public void setPrice( float price ) { this.price = price; }
}
