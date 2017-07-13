/**
 * Created by flaviu.lupoian on 13/07/2017.
 */
public class Price {
    private double value;
    private String formattedValue;

    public Price() {
    }

    public Price(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "; ";
    }
}
