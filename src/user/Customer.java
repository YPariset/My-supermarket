package user;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User  {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    public static ArrayList<User> customerList;
    Scanner scanner = new Scanner(System.in);

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public Customer(String username, String password) {
        super(username, password);
        customerList = new ArrayList<>();

        customerList.add(new User("Yoann","azerty"));
        customerList.add(new User("Lea","azerty"));
        customerList.add(new User("Paul","azerty"));
    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/



    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/


    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/



}
