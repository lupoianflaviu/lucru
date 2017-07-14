package oldmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Warehouse {
    private List<Fruit> fruits = new ArrayList<>();
    private List<Vegetable> vegetables = new ArrayList<>();
    private List<OtherProduct> otherProducts = new ArrayList<>();

    public void addFruits(Fruit fruit) {
        fruits.add(fruit);
    }

    public void addVegetables(Vegetable vegetable) {
        vegetables.add(vegetable);
    }

    public void addOtherProducts(OtherProduct otherProduct) {
        otherProducts.add(otherProduct);
    }

    @Override
    public String toString() {
        return "oldmodel.Warehouse:" + "\nFruits: " + fruits + "\nVegetables: " + vegetables + "\notherProducts: " + otherProducts;
    }
}
