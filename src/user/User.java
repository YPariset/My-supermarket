package user;

import java.util.Scanner;

public class User {

    /****************************************************/
    /***********           Attributes         ***********/
    /****************************************************/

    private String username;
    private String password;

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

    public boolean authenticate(String username, String pass) {
        return this.username.equals(username) && this.password.equals(pass);
    }

    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/

    public Menu getMenu() {
        return new UserMenu();
    }

    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/


}
