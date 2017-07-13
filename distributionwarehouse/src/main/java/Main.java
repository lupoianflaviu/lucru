/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Main {

    public static void main(String[] args) {

        Product apples = new Product("Apples", new Price(6), 300, new Producer("AppleFruits"));
        Product peaches = new Product("Peaches", new Price(30), 250, new Producer("FreshFruits"));
        Product crackers = new Product("Crackers", new Price(2), 50, new Producer("Food SA"));
        Product potatoes = new Product("Potatoes", new Price(15), 200, new Producer("FreshVegetables"));

//        Package aPackage = new Package();
        Bag applesBag = new Bag(20);
        applesBag.add(apples);
        Fruit fruit = new Fruit();
        fruit.addBags(applesBag);

        Box peachesBox = new Box(6);
        peachesBox.add(peaches);
        fruit.addBoxes(peachesBox);

        Warehouse warehouse = new Warehouse();
        warehouse.addFruits(fruit);

        System.out.println(warehouse.toString());
    }
}
