package storage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import product.Category;
import product.Producer;

/**
 * Created by flaviu.lupoian on 14/07/2017.
 */
public class Warehouse {
    List<Bag> bags = new ArrayList<>();
    List<Box> boxes = new ArrayList<>();
    List<Pack> packs = new ArrayList<>();

    public void addBag(Bag bag) {
        bags.add(bag);
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public void addPack(Pack pack) {
        packs.add(pack);
    }

    public int calculateWeightFruits() {
        int result = 0;

        for (Bag bag : bags) {

            if (bag.getCategory().equals(Category.FRUITS)) {
                result += bag.getWeight();
            }
        }

        for (Box box : boxes) {
            if (box.getCategory().equals(Category.FRUITS)) {
                result += box.getWeight();
            }
        }

        for (Pack pack : packs) {
            if (pack.getCategory().equals(Category.FRUITS)) {
                result += pack.getWeight();
            }
        }

        return result;
    }

    public int calculateWeightVegetables() {
        int result = 0;

        for (Bag bag : bags) {

            if (bag.getCategory().equals(Category.VEGETABLES)) {
                result += bag.getWeight();
            }
        }
        return result;
    }

    public int calculateWeightOther() {
        int result = 0;

        for (Bag bag : bags) {

            if (bag.getCategory().equals(Category.OTHER)) {
                result += bag.getWeight();
            }
        }
        return result;
    }

    public int countFruitProducers() {
        int result = 0;

        result = Collections.frequency(bags, Category.FRUITS);
        return result;
    }

    @Override
    public String toString() {
        return "Warehouse: " + bags + ", " + boxes + ", " + packs + '}';
    }
}
