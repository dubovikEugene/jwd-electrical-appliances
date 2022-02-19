package com.epam.jwd.entity.appliances;

import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.entity.enums.EnergyEfficiency;

public class WashingMachine extends Appliances {
    private EnergyEfficiency energyEfficiency;
    private double loadingUpKg;
    private double depthCm;
    private int spin;

    public WashingMachine(int powerConsumption,
                          Brand brand,
                          double weight,
                          boolean enabled,
                          int width,
                          int height,
                          EnergyEfficiency energyEfficiency,
                          double loadingUpKg,
                          double depthCm,
                          int spin) {
        super(powerConsumption, brand, weight, enabled, width, height);
        this.energyEfficiency = energyEfficiency;
        setLoadingUpKg(loadingUpKg);
        setDepthCm(depthCm);
        setSpin(spin);
    }

    public boolean washClothes(int someParams) {
        System.out.println("wash clothes");
//      Some realization
        return true;
    }

    public EnergyEfficiency getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(EnergyEfficiency energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    public double getLoadingUpKg() {
        return loadingUpKg;
    }

    public void setLoadingUpKg(double loadingUpKg) {
            this.loadingUpKg = loadingUpKg;
    }

    public double getDepthCm() {
        return depthCm;
    }

    public void setDepthCm(double depthCm) {
            this.depthCm = depthCm;
    }

    public int getSpin() {
        return spin;
    }

    public void setSpin(int spin) {
            this.spin = spin;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WashingMachine)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        WashingMachine that = (WashingMachine) obj;
        return Double.compare(that.loadingUpKg, loadingUpKg) == 0
                && Double.compare(that.depthCm, depthCm) == 0
                && spin == that.spin
                && energyEfficiency == that.energyEfficiency;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result * getEnergyEfficiency().hashCode();
        result = prime * result * (int) getLoadingUpKg();
        result = prime * result * (int) getDepthCm();
        result = prime * result * getSpin();
        return result;
    }

    @Override
    public String toString() {
        return "WashingMachine  {" + super.toString()
                + ", energyEfficiency=" + energyEfficiency
                + ", loadingUpKg=" + loadingUpKg
                + ", depthCm=" + depthCm
                + ", spin=" + spin
                + '}';
    }
}
