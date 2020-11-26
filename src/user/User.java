package user;

import consolePrompt.Menu;
import consolePrompt.UserMenu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    public static ArrayList<User> userList;

    public static ArrayList<String> guestOrder;
    public static ArrayList<Admin> adminList = new ArrayList<>();

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
    // methode Log in user
    public void LogIn() {

        User user1 = new User("guest", "guest");
        Admin admin1 = new Admin("admin", "admin");

        userList.add(user1);
        adminList.add(admin1);

        System.out.println("Please enter your username and your password \n ");
        System.out.println(" Username: ");
        System.out.print(">");
        String username = output.nextLine();
        System.out.println(" Password: ");
        System.out.print(">");
        String password = output.nextLine();


        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.authenticate(username , password)) {
                user.getMenu().show();
                break;
            }
        }

        for (int i = 0; i < adminList.size(); i++) {
            User admin = adminList.get(i);
            if (admin.authenticate(username, password)) {
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
        userList.add(theUser);
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
