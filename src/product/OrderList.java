package product;

import javax.swing.*;
import java.util.ArrayList;

public class OrderList {
    public static ArrayList<Order> myOrderList = null;

    public OrderList() {
        myOrderList = new ArrayList<>();
    }

    public void getOrderList(JTextArea resultArea) {
        String result = "";
        System.out.println("### Order List ###");
        for (Order myOrder : myOrderList) {
            result += "Name" + myOrder.getUserLambda() + " | Shopping List : " + myOrder.getShoppingCart() +
                    " | Total Amount: " + myOrder.getTotalAmount() + " | ID Order" + myOrder.getOrderID()+ "\n";
        }
        resultArea.setText(result);
    }

    public void addOrderToList( Order myOrder){
        myOrderList.add(myOrder);
    }

}