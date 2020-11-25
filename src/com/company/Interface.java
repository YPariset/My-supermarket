package com.company;

import product.StockProduct;
import user.User;

import javax.imageio.ImageIO;
import javax.naming.NamingEnumeration;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Interface extends JFrame {

    protected static StockProduct product = new StockProduct();
    protected static User user = new User("", "");

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

        JPanel paneEnter = new JPanel();
        JPanel paneLogIn = new JPanel();
        JPanel paneSignIn = new JPanel();
        JPanel paneLogInUser = new JPanel();
        JPanel paneMain = new JPanel();
        JPanel paneClient = new JPanel();
        JPanel paneAdmin = new JPanel();

        //setContentPane(paneMain);
        //paneMain.add(new JLabel(new ImageIcon("/Users/paulmarechal/IdeaProjects/My-supermarket/src/Picture/MainMenu.png")));

        //paneClient.setBackground(Color.green);


        /***********************************************************/
        /************** Configuration of Layout ********************/
        /***********************************************************/

        paneEnter.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneLogIn.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneMain.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneClient.setLayout(new FlowLayout(FlowLayout.CENTER));
        paneAdmin.setLayout(new FlowLayout(FlowLayout.CENTER));


        /***********************************************************/
        /********* Configuration Components of Panel ***************/
        /***********************************************************/

        // PanelEnter
        JLabel enterSignature = new JLabel("<html><h1>------- Welcome to your -----<br>---- Pineapple Supermarket ----");
        JButton enterAppButton = new JButton("<html><h1> - ENTER - ");
        paneEnter.setPreferredSize(new Dimension(450, 200));
        paneEnter.setFont(new Font("SCRIPT", Font.BOLD, 18));

        // PaneLogIN
        JLabel marketSignature = new JLabel("<html><h1>--------- Pineapple Supermarket ---------");
        JButton createAccount = new JButton("<html><h1>SIGN IN");
        JButton logIn = new JButton("<html><h1>LOG IN");
        JButton exitButton = new JButton("<html><h1>EXIT");
        JButton retourMainMenu = new JButton("RETOUR");
        paneLogIn.setPreferredSize(new Dimension(450, 200));
        paneLogIn.setFont(new Font("SCRIPT", Font.BOLD, 18));

        // Pane Sign In
        JLabel marketSignatur = new JLabel("<html><h1>--------- Pineapple Supermarket ---------");
        JLabel loginSignIn = new JLabel("<html><h1> . Login");
        JTextField loginText = new JTextField();
        loginText.setColumns(33);
        JLabel passWordSignIn = new JLabel("<html><h1>Password");
        JTextField passWordText = new JTextField();
        passWordText.setColumns(33);
        JButton validate = new JButton("<html><h2>VALIDATE");
        JButton returnMain = new JButton("<html><h2>RETOUR");


        // Pane LogInUser
        JLabel marketSignaturLogIn = new JLabel("<html><h1>--------- Pineapple Supermarket ---------");
        JLabel login = new JLabel("<html><h1>Login");
        JTextField loginUserText = new JTextField();
        loginUserText.setColumns(33);
        JLabel passWord = new JLabel("<html><h1>Password");
        JTextField passUserText = new JTextField();
        passUserText.setColumns(33);
        JButton enterApp = new JButton("<html><h2>ENTER");
        JButton retourMain = new JButton("<html><h2>RETOUR");


        // PanelMain
        JLabel mainMenu = new JLabel("<html><h1>--- Pineapple Supermarket ---");
        mainMenu.setPreferredSize(new Dimension(450, 200));
        mainMenu.setFont(new Font("SCRIPT", Font.BOLD, 18));
        mainMenu.setHorizontalAlignment(SwingConstants.CENTER);


        JLabel enterUsername = new JLabel("<html><h2>Username : ");
        enterUsername.setPreferredSize(new Dimension(150, 20));

        JTextField userNameText = new JTextField();
        userNameText.setColumns(30);

        JLabel enterPassword = new JLabel("<html><h2>Password : ");
        enterPassword.setPreferredSize(new Dimension(150, 20));

        JTextField userPassText = new JTextField();
        userPassText.setColumns(30);

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

        paneEnter.add(enterSignature);
        paneEnter.add(enterAppButton);

        paneLogIn.add(marketSignature);
        paneLogIn.add(createAccount);
        paneLogIn.add(logIn);
        paneLogIn.add(exitButton);

        paneSignIn.add(marketSignatur);
        paneSignIn.add(loginSignIn);
        paneSignIn.add(loginText);
        paneSignIn.add(passWordSignIn);
        paneSignIn.add(passWordText);
        paneSignIn.add(validate);
        paneSignIn.add(returnMain);

        paneLogInUser.add(marketSignaturLogIn);
        paneLogInUser.add(login);
        paneLogInUser.add(loginUserText);
        paneLogInUser.add(passWord);
        paneLogInUser.add(passUserText);
        paneLogInUser.add(enterApp);
        paneLogInUser.add(retourMain);

        paneMain.add(mainMenu);
        paneMain.add(enterUsername);
        paneMain.add(userNameText);
        paneMain.add(enterPassword);
        paneMain.add(userPassText);
        paneMain.add(enterButton);
        paneMain.add(retourMainMenu);

        paneClient.add(clientLabel);


        /***********************************************************/
        /****************** User actions management ****************/
        /***********************************************************/


        setContentPane(paneEnter);
        revalidate();

        // Enter button
        enterAppButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneLogIn);
                revalidate();
            }
        });

        // Create Account button
        createAccount.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneSignIn);
                revalidate();
            }
        });

        // Login button
        logIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneLogInUser);
                revalidate();
            }
        });

        // Exit button
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneEnter);
                revalidate();
            }
        });

        returnMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneEnter);
                revalidate();
            }
        });

        retourMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed( ActionEvent e ) {
                setContentPane(paneEnter);
                revalidate();
            }
        });









        /*
        enterButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setContentPane(paneClient);
                        revalidate();
                    }

                });
         */





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

