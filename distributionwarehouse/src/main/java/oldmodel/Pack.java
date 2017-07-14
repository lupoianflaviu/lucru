package oldmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Pack {
    private int capacity;
    private List<Product> productsInPack = new ArrayList<>();

    public Pack() {
    }

    public Pack(int capacity) {
        if (capacity >= 100 && capacity <= 500) {
            this.capacity = capacity;
        } else {
            throw new IllegalArgumentException(" oldmodel.Pack Capacity requirements not met.");
        }
    }

    public void add(Product product) {
        productsInPack.add(product);
    }

    public Price calculatePriceInAPack() {
        Price result = new Price(0);

        for (Product product : productsInPack) {
            result.setValue(result.getValue() + product.getUnitPrice().getValue() * this.capacity);
        }
        return result;
    }

    public int calculateNutritionalInAPack() {
        int result = 0;

        for (Product product : productsInPack) {
            result += product.getNutritionalQuality();
        }
        return result;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Product> getProductsInPack() {
        return productsInPack;
    }

    public void setProductsInPack(List<Product> productsInPack) {
        this.productsInPack = productsInPack;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        resultString.append(productsInPack).append("");
        return resultString.toString();
    }
}


