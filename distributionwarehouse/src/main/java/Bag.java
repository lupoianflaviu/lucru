import java.util.ArrayList;
import java.util.List;

/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Bag {
    private int capacity;
    private List<Product> productsInBag = new ArrayList<>();

    public Bag() {
    }

    public Bag(int capacity) {

        if (capacity >=15 && capacity <=25) {
            this.capacity = capacity;
        } else {
            throw new IllegalArgumentException(" Bag Capacity requirements not met.");
        }
    }

    public void add(Product product) {
        productsInBag.add(product);
    }

    public Price calculatePriceInABag() {
        Price result = new Price(0);

        for (Product product : productsInBag) {
            result.setValue(result.getValue() + product.getUnitPrice().getValue() * this.capacity);
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Product> getProductsInBag() {
        return productsInBag;
    }

    public void setProductsInBag(List<Product> productsInBag) {
        this.productsInBag = productsInBag;
    }

    @Override
    public String toString() {
        StringBuilder resultString = new StringBuilder();
        resultString.append(productsInBag).append("");
        return resultString.toString();
    }

    public String toStringOption2() {
        StringBuilder result = new StringBuilder();
        for (Product product : productsInBag) {
            result.append(product);
        }
        return result.toString();
    }
}
