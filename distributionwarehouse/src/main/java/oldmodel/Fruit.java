package oldmodel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Fruit implements Category {
    private List<Bag> bags = new ArrayList<>();
    private List<Box> boxes = new ArrayList<>();
    private List<Pack> packs = new ArrayList<>();

    @Override
    public void addBags(Bag bag) {
        bags.add(bag);
    }

    @Override
    public void addBoxes(Box box) {
        boxes.add(box);
    }

    @Override
    public void addPacks(Pack pack) {
        packs.add(pack);
    }

    @Override
    public int calculateTotalBagsWeight() {
        int result = 0;

        for (Bag bag : bags) {
            result += bag.getCapacity();
        }
        return result;
    }

    @Override
    public int calculateTotalBoxesWeight() {
        int result = 0;

        for (Box box : boxes) {
            result += box.getCapacity();
        }
        return result;
    }

    @Override
    public int calculateTotalPacksWeight() {
        int result = 0;

        for (Pack pack : packs) {
            result += pack.getCapacity();
        }
        return result;
    }

    @Override
    public int calculateTotalWeight() {
        return calculateTotalBagsWeight() + calculateTotalBoxesWeight() + calculateTotalPacksWeight();
    }

    @Override
    public Price calculateTotalBagsPrice() {
        Price result = new Price(0);

        for (Bag bag : bags) {
            result.setValue(result.getValue() + bag.calculatePriceInABag().getValue());
        }
        return result;
    }

    @Override
    public Price calculateTotalBoxesPrice() {
        Price result = new Price(0);

        for (Box box : boxes) {
            result.setValue(result.getValue() + box.calculatePriceInABox().getValue());
        }
        return result;
    }

    @Override
    public Price calculateTotalPacksPrice() {
        Price result = new Price(0);

        for (Pack pack : packs) {
            result.setValue(result.getValue() + pack.calculatePriceInAPack().getValue());
        }
        return result;
    }

    @Override
    public Price calculateTotalPrice() {
        return new Price(calculateTotalBagsPrice().getValue() + calculateTotalBoxesPrice().getValue() + calculateTotalPacksPrice().getValue());
    }

    @Override
    public int calculateBagsNutritional() {
        int result = 0;

        for (Bag bag : bags) {
            result += bag.calculateNutritionalInABag();
        }

        return result;
    }

    @Override
    public int calculateBoxesNutritional() {
        int result = 0;

        for (Box box : boxes) {
            result += box.calculateNutritionalInABox();
        }

        return result;
    }

    @Override
    public int calculatePacksNutritional() {
        int result = 0;

        for (Pack pack : packs) {
            result += pack.calculateNutritionalInAPack();
        }

        return result;
    }

    @Override
    public int calculateTotalNutritional() {
        return calculateBagsNutritional() + calculateBoxesNutritional() + calculatePacksNutritional();
    }

    @Override
    public String toString() {
        return "Total: " + calculateTotalWeight() + "kg, " + "Total oldmodel.Price: " + calculateTotalPrice().getValue() + "\n\t" + bags + ", Total "
                + calculateTotalBagsWeight() + " kg," + " Total oldmodel.Price: " + calculateTotalBagsPrice() + "\n\t" + boxes + ", Total "
                + calculateTotalBoxesWeight() + " kg," + " Total oldmodel.Price: " + calculateTotalBoxesPrice() + "\n\t" + packs + ", Total "
                + calculateTotalPacksWeight() + " kg," + " Total oldmodel.Price: " + calculateTotalPacksPrice();
    }

    public String toStringOptionTwo() {
        StringBuilder result = new StringBuilder();

        for (Bag bag : bags) {
            result.append(bag);
        }

        return result.toString();
    }
}
