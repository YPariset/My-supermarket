package product;

import javax.swing.*;
import java.util.ArrayList;

public class StockProduct {

    /****************************************************/
    /*************** Attributes/Instances ***************/
    /****************************************************/

    public static ArrayList<Product> productStockList;


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

    public void getProductStock(JTextArea resultArea) {
        String result = "";
        System.out.println("### Product List ###");
        for (Product myProduct : productStockList) {
            result += "Name: " + myProduct.getProduct()+ " | Quantity: " + myProduct.getQuantity() +
                    " | Price: " + myProduct.getPrice() + "€" + " | ID: " + myProduct.getId() + "\n";
            }
        resultArea.setText(result);
        //return productStockList;          //useless to swing
        }


    public void addProduct(String name, int quantity, int price, int id ){
        Product myProduct = new Product(name,quantity,price,id);
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


    public boolean checkQuantity (int quantityDesired, int productID) {
        Product product = null;
        Boolean quantityCheck = false;
        for (Product elements : productStockList) {
            if (elements.getId() == productID) {
                product = elements;
            }
        }
        if (product.getQuantity() >= quantityDesired) {
            quantityCheck = true;
        } else {
            quantityCheck = false;
        }
        return quantityCheck;
    }




    /****************************************************/
    /***********            Getters           ***********/
    /****************************************************/
    public static ArrayList<Product> getProductStockList() {
        return productStockList;
    }


}


