package consolePrompt;

import product.StockProduct;

import java.util.Scanner;

public class MainMenu implements Menu {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

   protected static StockProduct product = new StockProduct();


    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    @Override
    public void show() {
        AdminMenu adminMenu = new AdminMenu();
        UserMenu userMenu = new UserMenu();
        Scanner scan = new Scanner(System.in);

        // Main Menu
        System.out.println(" ");
        System.out.println("|---------------------------------|");
        System.out.println("> \uD83C\uDF4D My Pineapple Supermarket \uD83C\uDF4D  < ");
        System.out.println("|---------------------------------|");
        System.out.println(" ");
        System.out.println("What do you want to do ? ");
        System.out.println(" 1 ) Log in as a client ");
        System.out.println(" 2 ) Log in as an administrator ");
        System.out.println(" 3 ) Exit ");
        System.out.print(">");

        int mainMenuChoice = scan.nextInt();

        switch (mainMenuChoice) {
            case 1:
                userMenu.show();
                break;

            case 2 :
                adminMenu.show();
                break;

            case 3 :
                System.exit(1);
                break;
        }
    }
}