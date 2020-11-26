package product;

import java.util.ArrayList;

public class OrderList {
    public ArrayList<Order> myOrderList = null;

    public OrderList() {
        myOrderList = new ArrayList<>();
    }

    public ArrayList<Order> getOrderList() {
        String result = "";
        System.out.println("### Order List ###");
        for (Order myOrder : myOrderList) {
            result += "Name" + myOrder.getUserLambda() + " | Shopping List : " + myOrder.getShoppingCart() +
                    " | Total Amount: " + myOrder.getTotalAmount() + " | ID Order" + myOrder.getOrderID()+ "\n";
        }
        System.out.println(result);
        return myOrderList;
    }

    public void addOrderToList( Order myOrder){
        myOrderList.add(myOrder);
    }

}