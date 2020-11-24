package user;

import consolePrompt.Menu;
import consolePrompt.UserMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    public static ArrayList<User> userList = new ArrayList<>();

    private String username;
    private String password;

    Scanner output = new Scanner(System.in);

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    public void LogInUser() {

        User user1 = new User("tommy", "tommy");
        User user2 = new User("phil2", "phil2");

        userList.add(user1);
        userList.add(user2);

        System.out.println("Please enter your username and your password \n ");
        System.out.println(" Username: ");
        System.out.print(">");
        String username = output.nextLine();
        System.out.println(" Password: ");
        System.out.print(">");
        String password = output.nextLine();

        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.authenticate(username, password)) {
                user.getMenu().show();
                break;
            } else {
                System.out.println("Sorry you don't have permission");
            }
            break;
        }
    }                                               //Voir avec team pour optimiser LoginUser/loginAdmin

    public void LogInAdmin() {

        Admin admin = new Admin("admin", "admin");

        userList.add(admin);

        System.out.println("Please enter your username and your password \n ");
        System.out.println(" Username: ");
        System.out.print(">");
        String username = output.nextLine();
        System.out.println(" Password: ");
        System.out.print(">");
        String password = output.nextLine();


        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.authenticate(username, password)) {
                admin.getMenu().show();
                break;
            } else {
                System.out.println("Sorry you don't have permission");
            }
            break;
        }
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void addUser() {
        System.out.println("Please enter your username");
        String newUsername = output.nextLine();
        System.out.println("Please enter your password");
        String newPassword = output.nextLine();
        User theUser = new User(newUsername, newPassword);
        this.userList.add(theUser);
        System.out.println("Congrats ! You just created a new account");
    }

    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/

    public Menu getMenu() {
        return new UserMenu();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/



}
