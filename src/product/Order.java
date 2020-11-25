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
    protected CartShopping shoppingListLambda;
    protected int totalAmount;
    public int orderID;
    public static ArrayList<Order> orderList = null;

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Order(User nameUser, CartShopping shoppingListUser, int totalAmount, int orderID) {
        this.userLambda = nameUser;
        this.shoppingListLambda = shoppingListUser;
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



   /* public void displayOrder() {
        order.entrySet().forEach((line) -> {
            System.out.println(line.getKey() + " - " + line.getValue().getProduct());
        });
    }

    public static void generateId(int idGenerated) {
        orderID = idGenerated;
    }

    public String displayOrderToString() {
        return "";
    }
*/
    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/

  /*  public int getIdOrder() {
        return orderID;
    }

    public HashMap<Integer, Product> getOrder() {
        return order;
    }*/

    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/

   /* public void setOrder(HashMap<Integer, Product> order) {
        this.order = order;
    }*/

}
