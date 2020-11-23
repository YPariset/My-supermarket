package user;

import java.util.Scanner;

public class AdminMenu implements Menu {
    @Override
    public void show() {
        //show admin menu
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to do");
        System.out.println(" 1 ) List products ");
        System.out.println(" 2 ) Add a product ");
        System.out.println(" 3 ) Return ");

        int administratorChoice = scan.nextInt();

        switch (administratorChoice) {
            case 1:

                // Product List
                System.out.println("### Product List ###");
                System.out.println("0 to return ");
                System.out.println(" 1 ) Product ");
                int choiceProductList = scan.nextInt();
                switch (administratorChoice) {
                    case 0 :
                        new MainMenu();
                        break;

                    case 1 :
                        // product list
                        break;
                }
                break;

            case 2:
                // Add product
                System.out.println("### ADD PRODUCT ###");
                System.out.println("Enter product name ");
                String productName = scan.nextLine();
                System.out.println("Enter product price ");
                int productPrice = scan.nextInt();
                System.out.println("Enter product Quantity ");
                int productQuantity = scan.nextInt();
                if (productQuantity >= 0 ) {
                    System.out.println("Product added");
                }
                int addProduct = scan.nextInt();


            case 3:
                // return
                new MainMenu();

        }
    }
}
