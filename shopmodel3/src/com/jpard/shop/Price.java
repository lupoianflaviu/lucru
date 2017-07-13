package com.jpard.shop;

import java.io.Serializable;
import java.text.DecimalFormat;

/**
 * Created by flaviu.lupoian on 22/06/2017.
 */
public class Price implements Serializable {
    private double value;
    private String formattedValue;

    public Price(double value) {
        this.value = value;
        DecimalFormat format = new DecimalFormat("#.00");
        this.formattedValue = format.format(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getFormattedValue() {
        return formattedValue;
    }

    public void setFormattedValue(String formattedValue) {
        this.formattedValue = formattedValue;
    }
}
