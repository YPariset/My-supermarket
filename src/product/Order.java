package product;

import user.User;

import javax.swing.*;
import java.util.ArrayList;


public class Order {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    protected String userLambda;
    protected CartShopping shoppingCart;
    protected String totalAmount;
    public int orderID;
    public static ArrayList<Order> orderList;

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Order(String nameUser, CartShopping shoppingListUser, String totalAmount, int orderID) {
        this.userLambda = nameUser;
        this.shoppingCart = shoppingListUser;
        this.totalAmount = totalAmount;
        this.orderID = orderID;
    }

    public Order() {

    }


    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    public void getOrderList(JTextArea resultArea){
        String result = "";
        System.out.println("### Order List ###");
        for(Order myOrder : orderList){
            result += "Name" + myOrder.getUserLambda() + " | Shopping List : "+ myOrder.getShoppingCart() +
                    " | Total Amount: "+ myOrder.getTotalAmount() + " | ID Order" + myOrder.getOrderID();
        }
        resultArea.setText(result);
        //return orderList;
    }



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

   /* public void setOrder(HashMap<Integer, Product> order) {
        this.order = order;
    }*/

}
