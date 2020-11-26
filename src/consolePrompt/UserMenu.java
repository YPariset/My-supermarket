package consolePrompt;

import product.CartShopping;
import product.Order;
import product.OrderList;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

import static product.CartShopping.*;
public class UserMenu implements Menu {



    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    public void printAddToCart() {
        stockProduct.getProductStock(null);
       // cartShopping.addInputToCart();
        // cartShopping.displayCart();
        System.out.println("1) to order ");
        System.out.println("0) to return ");
        System.out.print(">");

    }

   /* public void printCart() {
        cartShopping.displayCart();
        System.out.println("0) to return ");
        System.out.print(">");
    }*/

    public void printConfirmPurchases() {
        System.out.println(" ");
        System.out.println("        ### Cart ###      ");
        System.out.println("--------------------------");
        System.out.println("Do you confirm your purchases ?");
        System.out.println(" 1 ) OK ");
        System.out.println(" 0 ) Cancel ");
        System.out.print(">");
    }

    @Override
    public void show() {

        boolean inProgress = false;

        while (!inProgress) {

            try {
                Scanner scan = new Scanner(System.in);

                // Client
                System.out.println(" ");
                System.out.println(" ### Client Interface ### ");
                System.out.println("--------------------------");
                System.out.println("What do you want to do");
                System.out.println(" 1 ) List products");
                System.out.println(" 2 ) Add product to cart ");
                System.out.println(" 3 ) See cart ");
                System.out.println(" 0 ) Logout ");
                System.out.print(">");
                int choiceClient = scan.nextInt();


                switch (choiceClient) {
                    case 1:
                        // List Product
                        MainMenu.product.getProductStock(null);
                        System.out.println("0) to return ");
                        System.out.print(">");
                        int choiceProductList = scan.nextInt();

                        switch (choiceProductList) {
                            case 0:
                                show();
                                break;
                        }

                    case 2:
                        //Add to cart
                       printAddToCart();
                       int cart = scan.nextInt();

                        switch (cart) {
                            case 1: // To confirm purchases
                                printConfirmPurchases();
                                int payed = scan.nextInt();
                                switch (payed) {
                                    case 1:
                                        Order orderUser = new Order(MainMenu.user.getUsername(), cartShopping,cartShopping.getCartTotalAmount(),1);
                                        AdminMenu.myOrderList.addOrderToList(orderUser);
                                        System.out.println("Thanks to ordered in Pineapple Market ! You will receive your articles soon.");
                                        System.out.println(AdminMenu.myOrderList);
                                        shoppingList.removeAll(shoppingList);
                                        break;
                                    case 0:
                                        show();
                                        break;
                                }
                            case 0:
                                show();

                        }
                    case 3:
                        //printCart();
                        int toReturn = scan.nextInt();
                        switch (toReturn) {
                            case 0:
                                show();
                                break;
                        }
                    case 0:
                        // Logout
                        MainMenu mainMenu = new MainMenu();
                        mainMenu.show();
                        break;

                }
            } catch (InputMismatchException e ) {
                System.out.println("Please enter a number between 1 to 3");
            }
        }
    }

}
