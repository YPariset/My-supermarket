package product;

import product.StockProduct;
import user.User;

import java.util.ArrayList;
import java.util.Scanner;


public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartShopping myshoppingList = new CartShopping();
        User guest = new User("lea","lea");
        Order test1 = new Order(guest ,myshoppingList,30.f,1);

        



    }
}
