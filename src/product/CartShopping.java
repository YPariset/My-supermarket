package product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CartShopping {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    public static ArrayList<Product> shoppingList;

    public static StockProduct stockProduct = new StockProduct();
    public static CartShopping cartShopping = new CartShopping();

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public CartShopping(){
        shoppingList = new ArrayList<>();
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

    public static void addInputToCart() {

        int chooseId = 0;
        int chooseQuantity = 0;

        try {
            System.out.println("Add to your cart your chosen products by tipping in the matching Id ");
            Scanner scanInputId = new Scanner(System.in);
            chooseId = scanInputId.nextInt();
            System.out.println("Choose a quantity : ");
            chooseQuantity = scanInputId.nextInt();

        }catch(InputMismatchException e){
            System.out.println("bad key ");
        }
        stockProduct.choseProductById(chooseId,chooseQuantity);

    }




    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/



    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/




}
