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
        this.capacity = capacity;
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
        return "Bag{" + "capacity=" + capacity + ", productsInBag=" + productsInBag + '}';
    }
}
