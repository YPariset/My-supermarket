package user;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {

    /****************************************************/
    /***********           Attributes         ***********/
    /****************************************************/

    public static ArrayList<User> adminList;
    Scanner scanner = new Scanner(System.in);

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Admin(String username, String password) {
        super(username, password);
        adminList = new ArrayList<>();

        adminList.add(new User("Admin","Admin"));
        adminList.add(new User("admin","admin"));
    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    @Override
    public Menu getMenu() {
        return new AdminMenu();
    }

    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/



    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/


}
