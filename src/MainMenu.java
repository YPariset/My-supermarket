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
        System.out.println("");
    }
}
