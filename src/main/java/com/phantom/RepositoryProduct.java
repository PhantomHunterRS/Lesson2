package com.phantom;


import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

import java.util.List;

@Repository
public class RepositoryProduct {
    private int idCount;
    List<Product> productList = new ArrayList<Product>();
    {
        productList.add(new Product(++idCount,"Milk",59.90));
        productList.add(new Product(++idCount,"Bread",39.50));
        productList.add(new Product(++idCount,"PineApple",64.99));
        productList.add(new Product(++idCount,"Potatoes",72.50));
        productList.add(new Product(++idCount,"Oil",99.99));
    }


}
