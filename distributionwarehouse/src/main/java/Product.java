import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Product {
    private String name;
    private Price unitPrice;
    private int nutritionalQuality;
    private Producer producer;
    private int totalWeightPerProducer;
    private Set<Producer> producerSet = new LinkedHashSet<>();

    public Product() {
    }

    public Product(String name, Price unitPrice, int nutritionalQuality, Producer producer) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.producer = producer;
        if (nutritionalQuality >= 50 && nutritionalQuality <= 600) {
            this.nutritionalQuality = nutritionalQuality;
        } else {
            throw new IllegalArgumentException("Nutritional Quality requirements not met.");
        }
        producerSet.add(this.producer);
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

    @Override
    public String toString() {
        return name + ": " + ", UnitPrice: " + unitPrice + ", nutritionalQuality=" + nutritionalQuality + ", producer: " + producer;
    }

    public String toStringOption2() {
        StringBuilder resultString = new StringBuilder();

        for (Producer producer : producerSet) {
            resultString.append(producer);
        }

        return resultString.toString();
    }
}
