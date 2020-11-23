package product;

import java.util.ArrayList;
import java.util.Scanner;

public class StockProduct {

    /****************************************************/
    /***********           Attributes         ***********/
    /****************************************************/

    private ArrayList<Product> productStockList = null;
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
        for (Product myProduct : productStockList) {
            result += "Name: " + myProduct.getProduct()+ " || Quantity: " + myProduct.getQuantity() +
                    " || Price: " + myProduct.getPrice() + "€ \n";
            }
        System.out.println(result);
        return productStockList;
        }


    public void addProduct(){

        String myProductName;
        int myProductQuantity;
        float myProductPrice;

        System.out.println("Enter new product name: ");
        myProductName = input.nextLine();
        myProductQuantity = input.nextInt();
        myProductPrice = input.nextFloat();

        Product myProduct = new Product(myProductName,myProductQuantity,myProductPrice);
        productStockList.add(myProduct);
    }

    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/



    /****************************************************/
    /***********            Setters           ***********/
    /****************************************************/

}
