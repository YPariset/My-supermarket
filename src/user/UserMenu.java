package user;

import product.Product;
import product.StockProduct;

import java.util.Scanner;

public class UserMenu implements Menu {
    @Override
    public void show() {
        StockProduct product = new StockProduct();
        //show user menu
        Scanner scan = new Scanner(System.in);

        // Client
        System.out.println("### Client ###");
        System.out.println("What do you want to do");
        System.out.println(" 1 ) List products");
        System.out.println(" 2 ) My cart ");
        System.out.println(" 3 ) Logout ");
        int choiceClient = scan.nextInt();

        switch (choiceClient) {
            case 1:
                // List Product
                product.getProductStock();

                int choiceProductList = scan.nextInt();

                switch (choiceProductList) {
                    case 0:
                        show();
                        break;
                }


            case 2:
                // My cart
                System.out.println("Product ");
                System.out.println("Total Price " + ""); // add final price
                System.out.println("What do you want to do? ");
                System.out.println(" 1 ) Buy cart ");
                System.out.println(" 2 ) Return ");
                int cart = scan.nextInt();

                switch (cart) {
                    case 1 :
                        System.out.println("### Cart ###");
                        System.out.println("Your cart has been processed you will receive you article soon ");
                        System.out.println("What do you want to do ");
                        System.out.println(" 1 ) OK ");
                        int payed = scan.nextInt();

                        switch (payed) {
                            case 1 :

                                break;
                        }
                        break;


                    case 2 :
                        
                        break;
                }

            case 3:
                // Logout
                break;

        }
    }
}