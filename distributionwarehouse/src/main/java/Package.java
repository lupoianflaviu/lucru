import java.util.ArrayList;
import java.util.List;

/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Package {
    private List<Product> bag = new ArrayList<>();
    private List<Product> pack = new ArrayList<>();
    private List<Product> box = new ArrayList<>();

    public void addInBag(Product product) {
        bag.add(product);
    }

    public List<Product> getBag() {
        return bag;
    }

    public void setBag(List<Product> bag) {
        this.bag = bag;
    }

    public List<Product> getPack() {
        return pack;
    }

    public void setPack(List<Product> pack) {
        this.pack = pack;
    }

    public List<Product> getBox() {
        return box;
    }

    public void setBox(List<Product> box) {
        this.box = box;
    }
}
