package product;

import product.StockProduct;

public class test {
    public static void main(String[] args) {
        StockProduct test = new StockProduct();
        boolean found  =test.isAvailable(test,9);
        if (found){
            System.out.println("Item found");
        }
    }
}
