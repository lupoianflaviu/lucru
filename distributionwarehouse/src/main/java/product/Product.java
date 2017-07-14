package product;

/**
 * Created by flaviu.lupoian on 14/07/2017.
 */
public class Product {
    private String name;
    private Price unitPrice;
    private int nutritionalQuality;
    private Producer producer;
    private Category category;

    public Product() {
    }

    public Product(String name, Price unitPrice, int nutritionalQuality, Producer producer, Category category) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.nutritionalQuality = nutritionalQuality;
        this.producer = producer;
        this.category = category;
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

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
