/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public interface Category {

    void addBags(Bag bag);

    void addBoxes(Box box);

    void addPacks(Pack pack);

    int calculateTotalBagsWeight();

    int calculateTotalBoxesWeight();

    int calculateTotalPacksWeight();

    int calculateTotalWeight();

    Price calculateTotalBagsPrice();

    Price calculateTotalBoxesPrice();

    Price calculateTotalPacksPrice();

    Price calculateTotalPrice();

    int calculateBagsNutritional();

    int calculateBoxesNutritional();

    int calculatePacksNutritional();

    int calculateTotalNutritional();
}
