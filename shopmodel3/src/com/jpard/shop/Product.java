package com.jpard.shop;

import java.io.Serializable;

/**
 * Created by flaviu.lupoian on 08/06/2017.
 */
public class Product  implements Serializable {
    private int name;
    private Price price;

    public Product(int name, Price price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product " + name;
    }

    public Price getPrice() {
        return price;
    }

}
