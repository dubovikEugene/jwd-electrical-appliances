package com.epam.jwd.entity.appliances;

import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.entity.enums.EnergyEfficiency;

public class ElectricKettle extends Appliances {
    private EnergyEfficiency energyEfficiency;
    private int volumeMillilitres;

    public ElectricKettle(int powerConsumption,
                          Brand brand,
                          double weight,
                          boolean enabled,
                          int width,
                          int height,
                          EnergyEfficiency energyEfficiency,
                          int volumeMillilitres) {
        super(powerConsumption, brand, weight, enabled, width, height);
        this.energyEfficiency = energyEfficiency;
        setVolumeMillilitres(volumeMillilitres);
    }

    public EnergyEfficiency getEnergyEfficiency() {
        return energyEfficiency;
    }

    public void setEnergyEfficiency(EnergyEfficiency energyEfficiency) {
        this.energyEfficiency = energyEfficiency;
    }

    public double getVolumeMillilitres() {
        return volumeMillilitres;
    }

    public void setVolumeMillilitres(int volumeMillilitres) {
            this.volumeMillilitres = volumeMillilitres;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null
                || !(obj instanceof ElectricKettle)) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        }
        ElectricKettle that = (ElectricKettle) obj;
        return (Double.compare(getVolumeMillilitres(), that.getVolumeMillilitres()) == 0)
                && this.getEnergyEfficiency() == that.getEnergyEfficiency();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result * (int) getVolumeMillilitres();
        result = 31 * result * getEnergyEfficiency().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ElectricKettle {" + super.toString()
                + ", energy efficiency=" + energyEfficiency
                + ", volume millilitres=" + volumeMillilitres
                + "}";
    }
}
