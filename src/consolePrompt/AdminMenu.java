package consolePrompt;

import java.util.Scanner;

public class AdminMenu implements Menu {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

   MainMenu mainMenu = new MainMenu();


    @Override
    public void show() {
        //show admin menu
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("  ### Admin Interface ###  ");
        System.out.println("--------------------------");
        System.out.println("What do you want to do");
        System.out.println(" 1 ) List products ");
        System.out.println(" 2 ) Add a product ");
        System.out.println(" 3 ) Return ");
        System.out.print(">");

        int administratorChoice = scan.nextInt();

        switch (administratorChoice) {
            case 1:
                // Product List
                MainMenu.product.getProductStock();
                int choiceProductList = scan.nextInt();

                switch (choiceProductList) {
                    case 0 :
                        show();
                        break;
                }
                break;

            case 2:
                // Add product
                MainMenu.product.addProduct();
                show();
                break;


            case 3:
                // return in the MainMenu
                mainMenu.show();

        }
    }
}