package user;

import product.StockProduct;

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
                System.out.println(" ");
                StockProduct product = new StockProduct();
                product.getProductStock();
                int choiceProductList = scan.nextInt();

                System.out.println("0 to return ");
                switch (choiceProductList) {
                    case 0 :
                        new MainMenu();
                        break;
                }
                break;

            case 2:
                // Add product
                StockProduct productAdd = new StockProduct();
                productAdd.addProduct();

            case 3:
                // return
                new MainMenu();

        }
    }
}
