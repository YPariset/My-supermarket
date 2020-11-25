package product;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StockProduct {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    public static ArrayList<Product> productStockList;
    public Scanner input = new Scanner(System.in);

    public static String myProductName;
    public static int myProductQuantity;
    public static float myProductPrice;
    public static int myProductID;

    /****************************************************/
    /***********           Constructor        ***********/
    /****************************************************/

    public StockProduct(){
        productStockList = new ArrayList<Product>();

        Product baguette = new Product("Baguette",30,.7f, 1);
        Product jam = new Product("Jam",20,2.3F, 3);
        Product banana = new Product("Banana",40,1.99f, 2);
        Product toiletPaper = new Product("Toilet Paper",80,2.99f, 4);
        Product pineapplePizza = new Product("Pineapple Pizza", 12, 5.99f, 5);

        productStockList.add(baguette);
        productStockList.add(banana);
        productStockList.add(jam);
        productStockList.add(toiletPaper);
        productStockList.add(pineapplePizza);

    }


/****************************************************/
    /***********            Methods           ***********/
    /****************************************************/

    public static ArrayList<Product> getProductStock() {
        String result = "";
        System.out.println("### Product List ###");
        for (Product myProduct : productStockList) {
            result += "Name: " + myProduct.getProduct()+ " | Quantity: " + myProduct.getQuantity() +
                    " | Price: " + myProduct.getPrice() + "€" + " | ID: " + myProduct.getId() + "\n";
            }
        System.out.println(result);
        return productStockList;
        }


    public void addProduct(){

        System.out.println("Enter new product name: ");
        myProductName = input.nextLine();
        System.out.println("Enter a quantity: ");
        myProductQuantity = input.nextInt();
        System.out.println("Enter a price: ");
        myProductPrice = input.nextFloat();
        System.out.println("Enter an ID: ");
        myProductID = input.nextInt();

        Product myProduct = new Product(myProductName,myProductQuantity,myProductPrice, myProductID);
        productStockList.add(myProduct);
    }

    public static void choseProductById(int scanId, int scanQuantity){
        for(Product elements : productStockList){
            if(scanId == elements.getId()){
                System.out.println(" ");
                System.out.println(elements.getProduct() + " has been added to cart\n");
                CartShopping.addToCart(elements.getProduct(), scanQuantity, elements.getPrice(), elements.getId());
                int updateQuantity = elements.getQuantity() - scanQuantity;
                elements.setQuantity(updateQuantity);
            }
        }
    }

    //check if the Id entered does match any Id of Items stocked
    public boolean isAvailable(StockProduct productStockList, int idRef) {
        boolean found = false;
        for (int i = 0; i < this.getProductStockList().size(); i++) {
            Product p = productStockList.getProductStockList().get(i);
            if (p.getId() == idRef){
                 found = true;
                 return found;
            }
        }
        return found;
    }
    public boolean checkQuantity (int quantityDesired) {
        boolean isQuantity = false;
        int i;
        for ( i = 0; i < getProductStockList().size(); i++) {
            Product p = getProductStockList().get(i);
            if (p.getQuantity()>= quantityDesired) {
                isQuantity = true;
                return isQuantity;
            }
           else {
                for (int j = 0; j < getProductStockList().size() ; j++) {
                    System.out.println("Not enough quantity, there is only: " + p.getQuantity() + " left.");

                }
                isQuantity = false;
               return isQuantity;
           }
        }
        return isQuantity;
    }



    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/
    public static ArrayList<Product> getProductStockList() {
        return productStockList;
    }


}


