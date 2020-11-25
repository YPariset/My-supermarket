package product;


import user.User;
import java.util.ArrayList;



public class test {



    public static void main(String[] args) {
        OrderList myOrderList = new OrderList();

        CartShopping myshoppingList = new CartShopping();
        User guest = new User("lea","lea");

        Order test1 = new Order(guest ,myshoppingList,30.f,1);
        Order test2 = new Order(guest,myshoppingList,50.f,2);

        myOrderList.addOrderToList(test1);
        myOrderList.addOrderToList(test2);

        myOrderList.getOrderList();




        



    }
}
