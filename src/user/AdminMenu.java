package user;

import product.StockProduct;

import java.util.Scanner;

public class AdminMenu implements Menu {
    StockProduct product = new StockProduct();
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
                product.getProductStock();
                int choiceProductList = scan.nextInt();

                switch (choiceProductList) {
                    case 0 :

                        break;
                }
                break;

            case 2:
                // Add product
                product.addProduct();
                show();
                break;


            case 3:
                // return
                show();

        }
    }
}
