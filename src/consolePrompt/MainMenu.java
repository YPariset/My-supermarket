package consolePrompt;

import product.StockProduct;
import user.Admin;
import user.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenu implements Menu {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    protected static StockProduct product = new StockProduct();
    User user = new User("", "");
    Admin admin = new Admin("", "");


    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    @Override
    public void show() {

        boolean inProgress = false;

        while (!inProgress) {
            try {
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
                        user.LogInUser();
                        break;

                    case 2:
                        admin.LogInAdmin();
                        break;

                    case 3:
                        System.exit(1);
                        break;
                }
            } catch (InputMismatchException e ) {
                System.out.println("Please enter a number");
            }
        }
    }
}
