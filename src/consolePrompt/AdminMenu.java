package consolePrompt;

import user.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdminMenu implements Menu {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    MainMenu mainMenu = new MainMenu();
    User user = new User("","");

    @Override
    public void show() {
        Boolean inProgress = false;

        while (!inProgress) {
            try {
                //show admin menu
                Scanner scan = new Scanner(System.in);
                System.out.println(" ");
                System.out.println("  ### Admin Interface ###  ");
                System.out.println("--------------------------");
                System.out.println("What do you want to do");
                System.out.println(" 1 ) List products ");
                System.out.println(" 2 ) Add a product ");
                System.out.println(" 3 ) See Client's order ");
                System.out.println(" 4 ) Log out ");
                System.out.print(">");

                int administratorChoice = scan.nextInt();

                switch (administratorChoice) {
                    case 1:
                        // Product List
                        MainMenu.product.getProductStock();
                        System.out.println("0 to return ");
                        System.out.print(">");
                        int choiceProductList = scan.nextInt();


                        switch (choiceProductList) {
                            case 0:
                                show();
                                break;
                        }
                        break;

                    case 2:
                        MainMenu.product.addProduct();
                        show();
                        break;

                    case 3:
                        for( User element : User.userList ) {
                            System.out.println(element.getUsername());
                        }
                        break;
                    case 4:
                        System.exit(1);
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number between 1 to 3");
            }
        }
    }
}
