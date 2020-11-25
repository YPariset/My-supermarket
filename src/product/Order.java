package product;

import java.util.HashMap;

public class Order {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    public static int orderID;
    public static HashMap<Integer, Product> order;

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Order() {
        this.order = new HashMap<Integer, Product>() ;
    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    public static  void createOrder(CartShopping shop){
        for(Product itemCart : shop.shoppingList) {
            order.put(orderID, itemCart);
        }
    }

    public void displayOrder() {
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

    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/

    public int getIdOrder() {
        return orderID;
    }

    public HashMap<Integer, Product> getOrder() {
        return order;
    }

    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/

    public void setOrder(HashMap<Integer, Product> order) {
        this.order = order;
    }

}
