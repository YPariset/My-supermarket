package user;

import java.awt.*;

import static user.Customer.customerList;

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

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void addUser(String userName, String password ) {
        User theUser = new User(userName, password);
        customerList.add(theUser);
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
