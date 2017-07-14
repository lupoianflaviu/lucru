package storage;

import java.util.ArrayList;
import java.util.List;

import product.Category;
import product.Producer;
import product.Product;

/**
 * Created by flaviu.lupoian on 14/07/2017.
 */
public class Pack {
    private int weight;
    private Category category;
    private Producer producer;
    private List<Product> productsInPack = new ArrayList<>();

    public Pack(int weight, Category category, Producer producer) {
        this.weight = weight;
        this.category = category;
        this.producer = producer;
    }

    public void add(Product product) {
        productsInPack.add(product);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Product> getProductsInPack() {
        return productsInPack;
    }

    public void setProductsInPack(List<Product> productsInPack) {
        this.productsInPack = productsInPack;
    }
}
