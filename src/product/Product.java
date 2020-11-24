package product;

public class Product {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    private int id;
    private String product;
    private int quantity;
    private float price;

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Product( String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product( String product, int quantity, float price ) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public Product( String product, int quantity, float price, int id ) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    //empty for now


    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/

    public String getProduct() { return product; }

    public int getQuantity() { return quantity; }

    public float getPrice() { return price; }

    public int getId() {
        return id;
    }

    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/


    public void setProduct( String product ) { this.product = product; }

    public void setQuantity( int quantity ) { this.quantity = quantity; }

    public void setPrice( float price ) { this.price = price; }

    public void setId(int id) {
        this.id = id;
    }
}
