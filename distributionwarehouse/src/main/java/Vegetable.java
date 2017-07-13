import java.util.ArrayList;
import java.util.List;

/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Vegetable implements Category {
    private List<Bag> bags = new ArrayList<>();
    private List<Box> boxes = new ArrayList<>();
    private List<Pack> packs = new ArrayList<>();

    @Override
    public void addBags(Bag bag) {

    }

    @Override
    public void addBoxes(Box box) {

    }

    @Override
    public void addPacks(Pack pack) {

    }

    @Override
    public int calculateTotalBagsWeight() {
        return 0;
    }

    @Override
    public int calculateTotalBoxesWeight() {
        return 0;
    }

    @Override
    public int calculateTotalPacksWeight() {
        return 0;
    }

    @Override
    public int calculateTotalWeight() {
        return 0;
    }

    @Override
    public Price calculateTotalBagsPrice() {
        return null;
    }

    @Override
    public Price calculateTotalBoxesPrice() {
        return null;
    }

    @Override
    public Price calculateTotalPacksPrice() {
        return null;
    }

    @Override
    public Price calculateTotalPrice() {
        return null;
    }
}
