package com.company;

import user.User;

import javax.naming.NamingEnumeration;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame {

    public Interface() {

        /*********************************************/
        /********* Configuration of JFrame ***********/
        /*********************************************/

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);



        /********************************************************/
        /************ Instantiation of our object ***************/
        /********************************************************/

        // show

        /***********************************************************/
        /***************** Configuration of JPanel *****************/
        /***********************************************************/

        // Main menu
        JPanel mainMenu = new JPanel();
        // Log in menu
        JPanel logInCHoice = new JPanel();
        // First client Interface
        JPanel firstClientInterface = new JPanel();
        // First admin interface
        JPanel firstAdminInterface = new JPanel();



        setContentPane(mainMenu);
        // this.setContentPane(new JLabel(new ImageIcon("/Users/paulmarechal/IdeaProjects/My-supermarket/src/Picture/CaptureEcran.png")));

        mainMenu.add(new JLabel(new ImageIcon("/Users/paulmarechal/Desktop/Market/MainMenu.png")));


        /***********************************************************/
        /************** Configuration of Layout ********************/
        /***********************************************************/

        mainMenu.setLayout(new FlowLayout(FlowLayout.CENTER));
        logInCHoice.setLayout(new FlowLayout(FlowLayout.CENTER));
        firstClientInterface.setLayout(new FlowLayout(FlowLayout.CENTER));
        firstAdminInterface.setLayout(new FlowLayout(FlowLayout.CENTER));


        /***********************************************************/
        /********* Configuration Components of Panel ***************/
        /***********************************************************/

        // MainMenu
        JLabel MainMenu = new JLabel("Welcome to your Pineapple Supermarket");
        MainMenu.setPreferredSize(new Dimension(600, 600));
        MainMenu.setFont(new Font("Courier new", Font.BOLD, 20));
        MainMenu.setIcon(new ImageIcon("/Users/paulmarechal/Desktop/Market/MainMenu.png"));
        MainMenu.add(new JButton("ENTER"));

        // Menu Log in
        logInCHoice.add(new JLabel("Please enter your user ID"));
        logInCHoice.add(new JLabel("Username : "));
        JTextField userNameText = new JTextField();
        userNameText.setColumns(15);
        logInCHoice.add(userNameText);

        logInCHoice.add(new JLabel("Password : "));
        JTextField userPassText = new JTextField();
        userPassText.setColumns(15);
        logInCHoice.add(userPassText);

        logInCHoice.add(new JButton("ENTER"));


        // Panel Client Interface
        firstClientInterface.add(new JLabel("Client interface "));
        JButton products = new JButton("PRODUCTS");
        JButton addProductsCart = new JButton("ADD PRODUCTS TO CART");
        JButton seeCart = new JButton("SEE CART");
        JButton logout = new JButton("LOGOUT");

        ButtonGroup buttonGroupClien = new ButtonGroup();
        buttonGroupClien.add(products);
        buttonGroupClien.add(addProductsCart);
        buttonGroupClien.add(seeCart);
        buttonGroupClien.add(logout);

        // Panel Admin Interface when Admin log
        JButton productAdmin = new JButton("PRODUCT LIST");
        JButton addProductAdmin = new JButton("ADD A PRODUCT");
        JButton seeClientOrder = new JButton("SEE CLIENT'S ORDER");

        ButtonGroup buttonGroupAdmin = new ButtonGroup();
        buttonGroupAdmin.add(productAdmin);
        buttonGroupAdmin.add(addProductAdmin);
        buttonGroupAdmin.add(seeClientOrder);
        buttonGroupAdmin.add(logout);

        // Panel product List - choix 1 - Admin interface
        JTextArea productLabel = new JTextArea(20, 28);

        // Panel add product - choice 2 - Admin interface











        /*
        entrer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                for (int i = 0; i < User.userList.size(); i++) {
                    User user = User.userList.get(i);
                    if (user.authenticate(userNameText, passWordText)) {
                        user.getMenu().show();
                        break;
                    } else {
                        JLabel createAccount = new JLabel("Please create a new account");
                        logMenu.add(createAccount);
                    }

                    // Client Interface
                    JLabel clientInterface = new JLabel();
                    clientInterface.add(new JButton("Products List"));
                    clientInterface.add(new JButton("Add product to cart"));
                    clientInterface.add(new JButton("See Cart"));
                    clientInterface.add(new JButton("Logout"));


                }

                for (int i = 0; i < User.adminList.size(); i++) {
                    User admin = User.adminList.get(i);
                    if (admin.authenticate(userNameText, passWordText)) {
                        admin.getMenu().show();
                        break;
                    } else {
                        System.out.println("Sorry you don't have permission");
                    }
                    break;
                }
            }

        });

         */




        // Panel Client Interface
        JLabel clientInterface = new JLabel();
        clientInterface.setIcon(new ImageIcon("/Users/paulmarechal/Desktop/Market/MainMenu.png"));
        clientInterface.setText("Pineapple Supermarket");
        clientInterface.add(new JButton("Products list"));
        clientInterface.add(new JButton("Add to cart"));
        clientInterface.add(new JButton("Logout"));


        // Button Products
        JButton baguette = new JButton("Baguette", new ImageIcon("/Users/paulmarechal/Desktop/Market/baguette.png"));
        baguette.setPreferredSize(new Dimension(50, 50));


        // Product List
        JLabel productList = new JLabel();
        productList.setIcon(new ImageIcon("/Users/paulmarechal/Desktop/Market/MainMenu.png"));
        productList.setText("Pineapple Supermarket");
        productList.add(getContentPane().add(baguette));
        add(productList);
        productList.setVisible(true);
        revalidate();

        productList.add(new JLabel("Press one time to add one in your cart"));

        // When press one time -> action
        productList.add(new JLabel("Added to your cart"));

    }

    // test voir TestButton
    public void choice() {
        JButton baguette = new JButton("Baguette", new ImageIcon("/Users/paulmarechal/Desktop/Market/baguette.png"));
        baguette.setPreferredSize(new Dimension(50, 50));
        baguette.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                JTextField quantityBaguette = new JTextField();

            }
        });


        // Product List
        JLabel productList = new JLabel();
        productList.setIcon(new ImageIcon("/Users/paulmarechal/Desktop/Market/MainMenu.png"));
        productList.setText("Pineapple Supermarket");
        productList.add(getContentPane().add(baguette));
        add(productList);
        productList.setVisible(true);
        revalidate();

    }
}
