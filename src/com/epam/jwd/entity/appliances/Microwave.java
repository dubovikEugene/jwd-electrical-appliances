package com.epam.jwd.entity.appliances;

import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.entity.enums.EnergyEfficiency;

public class Microwave extends Appliances {
    private int volumeLitres;
    private Boolean haveGrillMode;
    private int microwavesPower;
    private Boolean touchControl;
    private EnergyEfficiency energyEfficiency;

    public Microwave(int powerConsumption,
                     Brand brand,
                     double weight,
                     boolean enabled,
                     int width,
                     int height,
                     int volumeLitres,
                     Boolean haveGrillMode,
                     int microwavesPower,
                     Boolean touchControl,
                     EnergyEfficiency energyEfficiency) {
        super(powerConsumption, brand, weight, enabled, width, height);
        setVolumeLitres(volumeLitres);
        this.haveGrillMode = haveGrillMode;
        setMicrowavesPower(microwavesPower);
        this.touchControl = touchControl;
        this.energyEfficiency = energyEfficiency;
    }

    public int getVolumeLitres() {
        return volumeLitres;
    }

    public void setVolumeLitres(int volumeLitres) {
        this.volumeLitres = volumeLitres;
    }

    public boolean isHaveGrillMode() {
        return haveGrillMode;
    }

    public void setHaveGrillMode(boolean haveGrillMode) {
        this.haveGrillMode = haveGrillMode;
    }

    public int getMicrowavesPower() {
        return microwavesPower;
    }

    public void setMicrowavesPower(int microwavesPower) {
        this.microwavesPower = microwavesPower;
    }

    public boolean isTouchControl() {
        return touchControl;
    }

    public void setTouchControl(Boolean touchControl) {
        this.touchControl = touchControl;
    }

    public EnergyEfficiency getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(EnergyEfficiency energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Microwave)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        Microwave microwave = (Microwave) obj;
        return volumeLitres == microwave.volumeLitres
                && haveGrillMode == microwave.haveGrillMode
                && microwavesPower == microwave.microwavesPower
                && touchControl == microwave.touchControl
                && energyEfficiency == microwave.energyEfficiency;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result * getVolumeLitres();
        result = prime * result * haveGrillMode.hashCode();
        result = prime * result * microwavesPower;
        result = prime * result * touchControl.hashCode();
        result = prime * result * energyEfficiency.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Microwave {" + super.toString()
                + ", volumeLitres= " + volumeLitres
                + ", haveGrillMode= " + haveGrillMode
                + ", microwavesPower= " + microwavesPower
                + ", touchControl= " + touchControl
                + ", energyEfficiency= " + energyEfficiency
                + "}";
    }
}
