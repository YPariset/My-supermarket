package consolePrompt;

import java.util.InputMismatchException;
import java.util.Scanner;

import static product.CartShopping.cartShopping;
import static product.CartShopping.stockProduct;

public class UserMenu implements Menu {

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

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
                System.out.println(" 2 ) Add to cart ");
                System.out.println(" 3 ) Logout ");
                System.out.print(">");
                int choiceClient = scan.nextInt();
                stockProduct.getProductStock();
                cartShopping.addInputToCart();
                cartShopping.displayCart();


                switch (choiceClient) {
                    case 1:
                        // List Product
                        MainMenu.product.getProductStock();
                        int choiceProductList = scan.nextInt();

                        switch (choiceProductList) {
                            case 0:
                                show();
                                break;
                        }

                    case 2:
                        // Add to cart
                        System.out.println(" ");
                        System.out.println("What do you want to do? ");
                        System.out.println(" 1 ) Add to cart ");
                        System.out.println(" 2 ) Return ");
                        System.out.print(">");
                        int cart = scan.nextInt();




                        switch (cart) {
                            case 1:
                                System.out.println(" ");
                                System.out.println("        ### Cart ###      ");
                                System.out.println("--------------------------");
                                System.out.println("Your cart has been processed you will receive you article soon ");
                                System.out.println("What do you want to do ");
                                System.out.println(" 1 ) OK ");
                                System.out.print(">");
                                int payed = scan.nextInt();

                                switch (payed) {
                                    case 1:
                                        System.out.println("Thanks to ordered in Pineapple Market ! You will not receive your articles. Bye");
                                        //logout
                                        System.exit(1);
                                        break;
                                }
                                break;


                            case 2:
                                show();
                                break;
                        }

                    case 3:
                        // Logout
                        System.exit(1);
                        break;

                }
            } catch (InputMismatchException e ) {
                System.out.println("Please enter a number between 1 to 3");
            }
        }
    }

}
