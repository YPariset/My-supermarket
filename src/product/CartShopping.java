package product;

import java.util.ArrayList;
import java.util.Scanner;

public class CartShopping {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    protected static ArrayList<Product> shoppingList = null;

    public Scanner input = new Scanner(System.in);



    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public CartShopping(){
        shoppingList = new ArrayList<>();

        shoppingList.add(new Product("chocolate",20,1.99f,1));
    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/


    public static double getCartTotalAmount() {
        double totalAmount = 0;
        for (int i = 0; i < shoppingList.size(); i++) {
            totalAmount = totalAmount + (shoppingList.get(i).getQuantity() * shoppingList.get(i).getPrice());
        }
        return totalAmount;
    }

    public static void displayCart() {
        for(Product elements : shoppingList){
            if(shoppingList == null) {
                System.out.println("Votre panier est vide");
            }else {
                System.out.println("product : " + elements.getProduct() + " price: " + elements.getPrice() + "quantity: " + elements.getQuantity()+ "\n"
                        + " Montant total :" + getCartTotalAmount());
            }
        }
    }

    public static void addToCart(String name, int quantity, float price, int id){
        Product addProduct = new Product(name, quantity, price, id);
        shoppingList.add(addProduct);
    }



    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/



    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/




}
