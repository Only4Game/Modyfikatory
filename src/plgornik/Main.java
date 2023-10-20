package plgornik;

import plgornik.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        Product product1 = new Product("mleko", "nabiał", 5.59, 1, "l");
        Product product2 = new Product("jabłko", "owoc", 4.99, 1, "kg");
        Product product3 = new Product("woda", "napój", 1.39, 1.5, "l");
        Product product4 = new Product("chleb", "pieczywo", 3.79, 1, "szt");
        Product product5 = new Product("bułka", "pieczywo", 0.59, 1, "szt");
        Product product6 = new Product("pasztet", "drób", 4.39, 0.2, "kg");
        Product product7 = new Product("pierś z kurczaka", "drób", 17.99, 1, "kg");
        Product product8 = new Product("jogurt", "nabiał", 1.99, 250, "g");
        Product product9 = new Product("sok", "napój", 4.19, 1, "l");
        Product product10 = new Product("banan", "owoc", 12.99, 1, "kg");
        Product product11 = new Product("mleko", "nabiał", 2.99, 500, "ml");
        Product product12 = new Product("mleko", "nabiał", 2.99, 100, "ml");

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
        productList.add(product10);
        productList.add(product11);
        productList.add(product12);


        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }

        System.out.println("<----------------------------------->");

//        for (Product product : productList) {
//            System.out.println(product);

        System.out.println("<------------------Produkty z kategorii----------------->");

        for (Product productX : productList) {
            if (productX.getCategory().equals("nabiał"))
                System.out.println(productX);
        }

        System.out.println("<------------------Produkty o nazwie rozpoczynającej się od A do K----------------->");

        for(Product productY : productList) {
            if(productY.getName().toUpperCase().charAt(0) > 64 && productY.getName().toUpperCase().charAt(0) < 76){
                System.out.println(productY);
            }
        }

        System.out.println("<----------------Produkty o nazwie rozpoczynającej się od F do P---------------->");

        for(Product product : productList){
            if(product.getName().toUpperCase().charAt(0) > 69 && product.getName().toUpperCase().charAt(0) < 81){
                System.out.println(product);
            }
        }

        System.out.println("<----------------------------------->");

        for (Product product: productList){
            product.displayPrice();
        }
    }
}
