package product;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class CartShopping {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    public static ArrayList<Product> shoppingList = new ArrayList<>();

    public static StockProduct stockProduct = new StockProduct();
    public static CartShopping cartShopping = new CartShopping();

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public CartShopping(){

    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/


    public static String getCartTotalAmount() {

        Locale frLocale = new Locale("fr", "FR", "EURO");
        NumberFormat frFormat = NumberFormat.getCurrencyInstance(frLocale);

        double amount = 0;

        for (int i = 0; i < shoppingList.size(); i++) {
            amount = amount + (shoppingList.get(i).getQuantity() * shoppingList.get(i).getPrice());
        }
        String totalAmount = frFormat.format(amount);

        return totalAmount;
    }


    public static void displayCart(JTextArea myArea) {
        for(Product elements : shoppingList){
            if(shoppingList == null) {
               // System.out.println("Your cart is empty");         //useless to swing
                myArea.setText("\n Your cart is empty");
            }else {
                //useless to swing
               // System.out.println("product : " + elements.getProduct() + "|| price: " + elements.getPrice() + "|| quantity: " + elements.getQuantity()+ "\n"
               //         + " Montant total : " + getCartTotalAmount());
                myArea.setText("\n product : " + elements.getProduct() + "|| price: " + elements.getPrice() + "|| quantity: " + elements.getQuantity()+ "\n"
                                 + " Montant total : " + getCartTotalAmount());
            }
        }
    }


    public static void addToCart(String name, int quantity, float price, int id){
        Product addProduct = new Product(name, quantity, price, id);
        shoppingList.add(addProduct);
    }


    public void addFieldToCart(JTextField myId, JTextField myQuantity) {
        try {
            boolean exist = stockProduct.isAvailable(stockProduct, Integer.parseInt(myId.getText()));
            if (!exist) {
                JOptionPane wrongId = new JOptionPane();
                wrongId.showMessageDialog(null, "Your index does not exists!");
            } else {
                if (stockProduct.checkQuantity(Integer.parseInt(myQuantity.getText()), Integer.parseInt(myId.getText()))) {

                    stockProduct.choseProductById(Integer.parseInt(myQuantity.getText()), Integer.parseInt(myId.getText()));
                } else {
                    JOptionPane wrongQuantity = new JOptionPane();
                    wrongQuantity.showMessageDialog(null, "Quantity not valid !");
                }
            }
            }catch(Exception e){
                System.out.println("bad key ");
            }
    }

    public void clearShoppingCart() {
        shoppingList.removeAll(shoppingList);
    }


    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/



    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/




}
