package product;

import java.math.BigDecimal;
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


    public static void displayCart() {
        for(Product elements : shoppingList){
            if(shoppingList == null) {
                System.out.println("Your cart is empty");
            }else {
                System.out.println("product : " + elements.getProduct() + " || price: " + elements.getPrice() + " || quantity: " + elements.getQuantity());
            }
        }
        System.out.println(" Total amount :" + getCartTotalAmount()+ "\n");
    }


    public static void addToCart(String name, int quantity, float price, int id){
        Product addProduct = new Product(name, quantity, price, id);
        shoppingList.add(addProduct);
    }


    public static void addInputToCart() {

        int chooseId = 0;
        int chooseQuantity = 0;


        try {
            System.out.println("Add to your cart your chosen products by typing in the matching ID ");
            Scanner scanInputId = new Scanner(System.in);
            chooseId = scanInputId.nextInt();
            boolean existNot = stockProduct.isAvailable(stockProduct,chooseId);
            if (existNot){
                System.out.println("Choose a quantity : ");
                chooseQuantity = scanInputId.nextInt();
                stockProduct.choseProductById(chooseId,chooseQuantity);

            }else
                System.out.println("Wrong ID");

        }catch(InputMismatchException e){
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
