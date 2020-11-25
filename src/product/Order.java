package product;

import user.User;

import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Order {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    protected User userLambda;
    protected CartShopping shoppingCart;
    protected float totalAmount;
    public int orderID;
    public static ArrayList<Order> orderList = null;

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

    public ArrayList<Order> addOrder(Order myOrder){
        orderList.add(myOrder);
        return orderList;
    }
    public ArrayList<Order> getOrderList(){
        String result = "";
        System.out.println("### Order List ###");
        for(Order myOrder : orderList){
            result += "Name" + myOrder.getUserLambda() + " | Shopping List : "+ myOrder.getShoppingListLambda() +
                    " | Total Amount: "+ myOrder.getTotalAmount() + " | ID Order" + myOrder.getOrderID();
        }
        System.out.println(result);
        return orderList;
    }



    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/

    public User getUserLambda() {
        return userLambda;
    }

    public CartShopping getShoppingListLambda() {
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

   /* public void setOrder(HashMap<Integer, Product> order) {
        this.order = order;
    }*/

}
