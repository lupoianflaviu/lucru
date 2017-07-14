import product.Category;
import product.Price;
import product.Producer;
import product.Product;
import storage.Bag;
import storage.Warehouse;

/**
 * Created by flaviu.lupoian on 14/07/2017.
 */
public class WarehouseDemo {

    public static void main(String[] args) {
        Product apples = new Product("Apples", new Price(6), 300);
        Product oranges = new Product("Oranges", new Price(13), 100);
        Product crackers = new Product("Crackers", new Price(2), 50);
        Product potatoes = new Product("Potatoes", new Price(15), 200);
        Product onions = new Product("Onions", new Price(2.5), 150);

        Bag appleBag = new Bag(20, Category.FRUITS, Producer.APPLEFRUIT);
        appleBag.add(apples);
        Bag orangesBag = new Bag(15, Category.FRUITS, Producer.CITRI);
        appleBag.add(oranges);

        Warehouse warehouse = new Warehouse();
        warehouse.addBag(appleBag);
        warehouse.addBag(orangesBag);

        System.out.println(warehouse.toString());
        System.out.println(" Total kg fructe: " + warehouse.calculateWeightFruits());
        System.out.println(warehouse.countFruitProducers());

    }
}
