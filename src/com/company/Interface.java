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

        JPanel paneMain = new JPanel();
        JPanel paneClient = new JPanel();
        JPanel paneAdmin = new JPanel();

        setContentPane(paneMain);
        paneMain.setBackground(Color.ORANGE);
        paneClient.setBackground(Color.green);

        /***********************************************************/
        /************** Configuration of Layout ********************/
        /***********************************************************/

        paneMain.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneClient.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneAdmin.setLayout(new FlowLayout(FlowLayout.CENTER));


        /***********************************************************/
        /********* Configuration Components of Panel ***************/
        /***********************************************************/

        // PanelMain
        JLabel mainMenu = new JLabel("Welcome to your Pineapple Supermarket");
        mainMenu.setPreferredSize(new Dimension(450, 200));
        mainMenu.setFont(new Font("Courier new", Font.BOLD, 20));

        JLabel enterUsername = new JLabel("Username : ");
        enterUsername.setPreferredSize(new Dimension(150, 50));

        JTextField userNameText = new JTextField();
        userNameText.setColumns(30);

        JLabel enterPassword = new JLabel("Password : ");

        JTextField userPassText = new JTextField();
        userPassText.setColumns(29);

        JButton enterButton = new JButton("ENTER");


        // PanelClient
        JLabel clientLabel = new JLabel("Client interface ");
        /*JButton products = new JButton("PRODUCTS");
        JButton addProductsCart = new JButton("ADD PRODUCTS TO CART");
        JButton seeCart = new JButton("SEE CART");
        JButton logout = new JButton("LOGOUT");

        ButtonGroup buttonGroupClien = new ButtonGroup();
        buttonGroupClien.add(products);
        buttonGroupClien.add(addProductsCart);
        buttonGroupClien.add(seeCart);
        buttonGroupClien.add(logout);

        // PanelAdmin
        JButton productAdmin = new JButton("PRODUCT LIST");
        JButton addProductAdmin = new JButton("ADD A PRODUCT");
        JButton seeClientOrder = new JButton("SEE CLIENT'S ORDER");

        ButtonGroup buttonGroupAdmin = new ButtonGroup();
        buttonGroupAdmin.add(productAdmin);
        buttonGroupAdmin.add(addProductAdmin);
        buttonGroupAdmin.add(seeClientOrder);
        buttonGroupAdmin.add(logout);*/

        /***********************************************************/
        /**************** Add components in Panel ******************/
        /***********************************************************/

        paneMain.add(mainMenu);
        paneMain.add(enterUsername);
        paneMain.add(userNameText);
        paneMain.add(enterPassword);
        paneMain.add(userPassText);
        paneMain.add(enterButton);

        paneClient.add(clientLabel);




        /***********************************************************/
        /****************** User actions management ****************/
        /***********************************************************/

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setContentPane(paneClient);
                revalidate();
            }

        });



       /*
        // product List - choix 1 - Admin interface

        // add application Title
        JTextArea productLabel = new JTextArea(20, 28);
        // add "retour" button

        // add product - choice 2 - Admin interface
        JLabel addProduct = new JLabel("Enter a new product name : ");
        JTextField addProductText = new JTextField();

        // See client's order - choice 3 - admin interface


        // Log out - choice 4 - admin interface

        paneMain.add(new JButton("Hello"));


        // Client Interface
        //
        JButton productListClient = new JButton("Product List");
        JButton addProductToCartClient = new JButton("Add product to cart");
        JButton seeCartClient = new JButton("See cart");
        // add log out button

        // product List - choix 1 - Client interface
        // add ProductLabel
        JLabel addProductToCart = new JLabel("Add to your cart your chosen products by typing in the matching ID");
        JTextField addProductToChartQuantity = new JTextField();
        addProductToChartQuantity.setColumns(7);

        JLabel addProductToCartAdded = new JLabel("Added to cart"); //+ productName + quantity
        JLabel addProductToCartPrice = new JLabel("Total amount : "); // + total price

        JButton toOrder = new JButton("ORDER");
        JButton toReturn = new JButton("RETURN");

        // If order
        JLabel confirmPurchases = new JLabel("Do you confirm your purchases ?");
        JButton pruchasesOk = new JButton("CONFIRM");
        JButton pruchasesCancel = new JButton("CANCEL");

        // If order confirm
        JLabel purchasesSend = new JLabel("Thanks to ordered in Pineapple Market ! You will receive your articles soon.");



*/
    }
}
