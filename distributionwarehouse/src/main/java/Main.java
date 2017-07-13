/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Main {

    public static void main(String[] args) {

        Product apples = new Product("Apples", new Price(6), 300, new Producer("AppleFruits"));
        Product peaches = new Product("Peaches", new Price(30), 250, new Producer("FreshFruits"));
        Product crackers = new Product("Crackers", new Price(2), 50, new Producer("Food SA"));
        Product potatoes = new Product("Potatoes", new Price(15), 200, new Producer("FreshVegetables"));
        Product onions = new Product("Onions", new Price(2.5), 150, new Producer("CountryVegetables"));

        //add fruits
        Bag applesBag = new Bag(20);
        applesBag.add(apples);
        Fruit fruit = new Fruit();
        fruit.addBags(applesBag);

        Box peachesBox = new Box(30);
        peachesBox.add(peaches);
        fruit.addBoxes(peachesBox);

        Warehouse warehouse = new Warehouse();
        warehouse.addFruits(fruit);

        //add vegetables
        Bag onionBag = new Bag(15);
        onionBag.add(onions);
        Vegetable vegetable = new Vegetable();
        vegetable.addBags(onionBag);
        warehouse.addVegetables(vegetable);

        //add otherProducts
        Pack crackersPack = new Pack(100);
        crackersPack.add(crackers);
        OtherProduct otherProduct = new OtherProduct();
        otherProduct.addPacks(crackersPack);
        warehouse.addOtherProducts(otherProduct);

        System.out.println(warehouse.toString());
        System.out.println("###################################");

    }
}
