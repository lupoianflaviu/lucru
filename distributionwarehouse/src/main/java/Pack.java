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
        this.capacity = capacity;
    }

    public Price calculatePriceInAPack() {
        Price result = new Price(0);

        for (Product product : productsInPack) {
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

    public List<Product> getProductsInPack() {
        return productsInPack;
    }

    public void setProductsInPack(List<Product> productsInPack) {
        this.productsInPack = productsInPack;
    }
}


