package consolePrompt;

import java.util.Scanner;

public class UserMenu implements Menu {


    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    @Override
    public void show() {

        Scanner scan = new Scanner(System.in);

        // Client
        System.out.println(" ");
        System.out.println(" ### Client Interface ### ");
        System.out.println("--------------------------");
        System.out.println("What do you want to do");
        System.out.println(" 1 ) List products");
        System.out.println(" 2 ) My cart ");
        System.out.println(" 3 ) Logout ");
        System.out.print(">");
        int choiceClient = scan.nextInt();

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
                // My cart
                System.out.println(" ");
                System.out.println("Product: ");
                System.out.println("Total Price: " + ""); // add final price
                System.out.println("What do you want to do? ");
                System.out.println(" 1 ) Buy cart ");
                System.out.println(" 2 ) Return ");
                System.out.print(">");
                int cart = scan.nextInt();

                switch (cart) {
                    case 1 :
                        System.out.println(" ");
                        System.out.println("        ### Cart ###      ");
                        System.out.println("--------------------------");
                        System.out.println("Your cart has been processed you will receive you article soon ");
                        System.out.println("What do you want to do ");
                        System.out.println(" 1 ) OK ");
                        System.out.print(">");
                        int payed = scan.nextInt();

                        switch (payed) {
                            case 1 :
                                System.out.println("Thanks to ordered in Pineapple Market ! You will not receive your articles. Bye");
                                //logout
                                System.exit(1);
                                break;
                        }
                        break;


                    case 2 :
                        show();
                        break;
                }

            case 3:
                // Logout
                System.exit(1);
                break;

        }
    }
}
