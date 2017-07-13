import java.util.ArrayList;
import java.util.List;

/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Box {
    private int capacity;
    private List<Product> productsInBox = new ArrayList<>();

    public Box() {
    }

    public Box(int capacity) {
        this.capacity = capacity;
    }

    public void add(Product product) {
        productsInBox.add(product);
    }

    public Price calculatePriceInABox() {
        Price result = new Price(0);

        for (Product product : productsInBox) {
            result.setValue(result.getValue() + product.getUnitPrice().getValue());
        }
        return result;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Product> getProductsInBox() {
        return productsInBox;
    }

    public void setProductsInBox(List<Product> productsInBox) {
        this.productsInBox = productsInBox;
    }

    @Override
    public String toString() {
        return "Box{" + "capacity=" + capacity + ", productsInBox=" + productsInBox + '}';
    }
}


