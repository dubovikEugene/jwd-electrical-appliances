package com.epam.jwd.entity.appliances;

import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.logic.search.criteria.SearchCriteria;

public abstract class Appliances {
    private int powerConsumption;
    private Brand brand;
    private double weight;
    private boolean enabled;
    private int width;
    private int height;

    public Appliances(int powerConsumption,
                      Brand brand,
                      double weight,
                      boolean enabled,
                      int width,
                      int height) {
        this.powerConsumption = powerConsumption;
        setPowerConsumption(powerConsumption);
        this.brand = brand;
        setWeight(weight);
        this.enabled = enabled;
        setWidth(width);
        setHeight(height);
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isEnabled() {
        return enabled;
    }

    private void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Appliances)) {
            return false;
        }
        Appliances that = (Appliances) obj;
        return powerConsumption == that.powerConsumption
                && Double.compare(that.weight, weight) == 0
                && brand == that.brand;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = getPowerConsumption();
        result = prime * result * (int) getWeight();
        result = prime * result * getBrand().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "brand= " + getBrand()
                + ", power consumption = " + getPowerConsumption()
                + ", weight = " + getWeight();
    }
}
