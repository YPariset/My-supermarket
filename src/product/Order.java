package product;

import user.User;

import java.util.ArrayList;


public class Order {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    protected User userLambda;
    protected CartShopping shoppingCart;
    protected float totalAmount;
    public int orderID;


    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Order(User nameUser, CartShopping shoppingListUser, float totalAmount, int orderID) {
        this.userLambda = nameUser;
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

    public User getUserLambda() {
        return userLambda;
    }

    public CartShopping getShoppingCart() {
        return shoppingCart;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public int getOrderID() {
        return orderID;
    }


    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/

}
