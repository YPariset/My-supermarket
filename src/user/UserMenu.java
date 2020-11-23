package user;

import java.util.Scanner;

public class UserMenu implements Menu {
    @Override
    public void show() {
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
                System.out.println("### Product List ###");
                System.out.println("0 to return ");
                System.out.println(" 1 ) Product ");
                int choiceProductList = scan.nextInt();

                switch (choiceProductList) {
                    case 0:


                    case 1:
                        // product

                }
                break;

            case 2:
                // My cart
                System.out.println("Product ");
                System.out.println("Total Price " + ""); // add final price
                System.out.println("What do you want to do? ");
                System.out.println(" 1 ) Buy cart ");
                System.out.println(" 2 ) Return ");
                int cart = scan.nextInt();

                break;

            case 3:
                // Logout
                break;

        }
    }
}
