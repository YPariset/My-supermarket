package product;

import java.util.ArrayList;
import java.util.Scanner;

public class StockProduct {
    /****************************************************/
    /***********           Attributes         ***********/
    /****************************************************/

    private ArrayList<Product> productStockList;
    public Scanner input = new Scanner(System.in);

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public StockProduct(){
        productStockList = new ArrayList<Product>();

        Product baguette = new Product("Baguette",30,.7f);
        Product jam = new Product("Jam",20,2.3F);
        Product banana = new Product("Banana",40,1.99f);
        Product toiletPaper = new Product("Toilet Paper",80,2.99f);
        Product pineapplePizza = new Product("Pineapple Pizza", 12, 5.99f);

        productStockList.add(baguette);
        productStockList.add(banana);
        productStockList.add(jam);
        productStockList.add(toiletPaper);
        productStockList.add(pineapplePizza);

    }

    /****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    public ArrayList<Product> getProductStock() {
        String result = "";
        System.out.println("### Product List ###");
        System.out.println(" ");
        for (Product myProduct : productStockList) {
            result += "Name: " + myProduct.getProduct()+ " | Quantity: " + myProduct.getQuantity() +
                    " | Price: " + myProduct.getPrice() + "€ \n";
            }
        System.out.println(result);
        System.out.println("0 to return ");
        System.out.println(">");
        return productStockList;
        }


    public void addProduct(){

        String myProductName;
        int myProductQuantity;
        float myProductPrice;

        System.out.println("Enter new product name: ");
        myProductName = input.nextLine();
        System.out.println("Enter a quantity: ");
        myProductQuantity = input.nextInt();
        System.out.println("Enter a price: ");
        myProductPrice = input.nextFloat();

        Product myProduct = new Product(myProductName,myProductQuantity,myProductPrice);
        productStockList.add(myProduct);
    }

    public boolean isAvailable(Product itemToFind){
        boolean found = false;
        if(productStockList.contains(itemToFind)){
            System.out.println(itemToFind + " is Available.");
            found = true;
        }else {
            System.out.println(itemToFind + " is not Available.");
            found = false;
        }
        return found;
    }
    public void checkQuantity (Product itemQuantityToFind){
        int quantityDesired;
        if (isAvailable(itemQuantityToFind)){
            System.out.println("Enter the quantity desired: ");
            quantityDesired = input.nextInt();
            if(quantityDesired < itemQuantityToFind.getQuantity()){
                System.out.println("Item quantity available.");

            }
        }
    }



    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/



    }


