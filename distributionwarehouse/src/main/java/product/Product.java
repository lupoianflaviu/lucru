package product;

/**
 * Created by flaviu.lupoian on 14/07/2017.
 */
public class Product {
    private String name;
    private Price unitPrice;
    private int nutritionalQuality;

    public Product() {
    }

    public Product(String name, Price unitPrice, int nutritionalQuality) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.nutritionalQuality = nutritionalQuality;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Price getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Price unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getNutritionalQuality() {
        return nutritionalQuality;
    }

    public void setNutritionalQuality(int nutritionalQuality) {
        this.nutritionalQuality = nutritionalQuality;
    }

    @Override
    public String toString() {
        return "\n" + name + ", " + unitPrice + ", " + nutritionalQuality;
    }
}
