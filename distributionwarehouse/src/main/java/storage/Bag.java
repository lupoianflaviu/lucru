package storage;

import java.util.ArrayList;
import java.util.List;

import product.Category;
import product.Price;
import product.Producer;
import product.Product;

/**
 * Created by flaviu.lupoian on 14/07/2017.
 */
public class Bag {
    private int weight;
    private Category category;
    private Producer producer;
    private List<Product> productsInBag = new ArrayList<>();

    public Bag(int weight, Category category, Producer producer) {
        if (weight >= 15 && weight <= 25) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Bag Capacity requirements not met.");
        }
        this.category = category;
        this.producer = producer;
    }

    public void add(Product product) {
        productsInBag.add(product);
    }

    public Price calculatePriceInABag() {
        Price result = new Price(0);

        for (Product product : productsInBag) {
            result.setValue(result.getValue() + product.getUnitPrice().getValue() * this.weight);
        }
        return result;
    }

    public int calculateNutritionalInABag() {
        int result = 0;

        for (Product product : productsInBag) {
            result += product.getNutritionalQuality();
        }
        return result;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<Product> getProductsInBag() {
        return productsInBag;
    }

    public void setProductsInBag(List<Product> productsInBag) {
        this.productsInBag = productsInBag;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Bag bag = (Bag) o;

        if (weight != bag.weight)
            return false;
        if (category != bag.category)
            return false;
        if (producer != bag.producer)
            return false;
        return productsInBag != null ? productsInBag.equals(bag.productsInBag) : bag.productsInBag == null;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (productsInBag != null ? productsInBag.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        resultString.append(productsInBag).append("");
        return resultString.toString();
    }
}
