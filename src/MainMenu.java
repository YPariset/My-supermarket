import java.util.Scanner;

public class MainMenu {
    public MainMenu() {

        Scanner scan = new Scanner(System.in);

        // Main Menu
        System.out.println("### Main ###");
        System.out.println("What do you want to do ? ");
        System.out.println(" 1 ) Log in as a client ");
        System.out.println(" 2 ) Log in as an administrator ");
        System.out.println(" 3 ) Exit ");

        int MainMenuChoice = scan.nextInt();

        // Client
        System.out.println("### Client ###");
        System.out.println("What do you want to do");
        System.out.println(" 1 ) List products");
        System.out.println(" 2 ) My cart ");
        System.out.println(" 3 ) Logout ");

        int choiceClient = scan.nextInt();

        // Product List
        System.out.println("### Product List ###");
        System.out.println("0 to return ");
        System.out.println(" 1 ) Product ");

        int choiceProductList = scan.nextInt();

        // Product
        System.out.println("Product ");
        System.out.println("How many product do you want ? ( 0 to return)");

        int choiceProduct = scan.nextInt();

        // Sub menu Product
        System.out.println("### Product ### ");
        System.out.println("Product");
        System.out.println("How many product do you want ? ( 0 to return)");

        int subMenuProduct = scan.nextInt();

        // Cart
        System.out.println("Product ");
        System.out.println("Total Price " + ""); // add final price
        System.out.println("What do you want to do? ");
        System.out.println(" 1 ) Buy cart ");
        System.out.println(" 2 ) Return ");

        int cart = scan.nextInt();

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


    }
}
