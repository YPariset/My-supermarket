package product;

public class Order {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    protected String userLambda;
    protected CartShopping shoppingCart;
    protected String totalAmount;
    public int orderID;


    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Order(CartShopping shoppingListUser, String totalAmount, int orderID) {
        this.shoppingCart = shoppingListUser;
        this.totalAmount = totalAmount;
        this.orderID = orderID;
    }


    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/



    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/

    public String getUserLambda() {
        return userLambda;
    }

    public CartShopping getShoppingCart() {
        return shoppingCart;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public int getOrderID() {
        return orderID;
    }


    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/



}
