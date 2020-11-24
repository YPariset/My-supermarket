package product;

import java.util.ArrayList;
import java.util.Scanner;

public class CartShopping {

private ArrayList<StockProduct> shoppingList = null;
public Scanner inputCustumer = new Scanner(System.in);

public CartShopping(){
    shoppingList = new ArrayList<>();
}

public void addProductShopping(){
    String itemName;
    int itemQuantity;
    System.out.println("Enter the item Name: ");
    itemName = inputCustumer.nextLine();
    System.out.println("Enter quantity:");
    itemQuantity = inputCustumer.nextInt();
    //to continue

}

}
