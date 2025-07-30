package org.magz014;

import org.magz014.prototype.PriceList;
import org.magz014.prototype.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PriceList priceList = new PriceList("Lista normal");
        List<Product> productList = List.of(
                new Product(1111,"Nme1"),
                new Product(2222,"Nme2"),
                new Product(3333,"Nme3"),
                new Product(4444,"Nme4"),
                new Product(5555,"Nme5"),
                new Product(6666,"Nme6")
        );
        priceList.setProductList(productList);

        System.out.println(productList);

        //Sugunda lista con descuento
        PriceList priceList2 = (PriceList) priceList.deepClone();
        priceList2.setName("Lista 2");
        for (Product product: priceList2.getProductList()){
            product.setPrice(product.getPrice()*.90);
        }

        System.out.println(priceList2);

    }
}