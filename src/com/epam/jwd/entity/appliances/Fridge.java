package com.epam.jwd.entity.appliances;


import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.entity.enums.NoFrost;

public class Fridge extends Appliances {
    private NoFrost noFrost;
    private int usefulVolume;
    private Boolean inverterCompressor;

    public Fridge(int powerConsumption,
                  Brand brand,
                  double weight,
                  boolean enabled,
                  int width,
                  int height,
                  NoFrost noFrost,
                  int usefulVolume,
                  Boolean inverterCompressor) {
        super(powerConsumption, brand, weight, enabled, width, height);
        this.noFrost = noFrost;
        this.usefulVolume = usefulVolume;
        this.inverterCompressor = inverterCompressor;
    }

    public NoFrost getNoFrost() {
        return noFrost;
    }

    public void setNoFrost(NoFrost noFrost) {
        this.noFrost = noFrost;
    }

    public int getUsefulVolume() {
        return usefulVolume;
    }

    public void setUsefulVolume(int usefulVolume) {
            this.usefulVolume = usefulVolume;
    }

    public Boolean getInverterCompressor() {
        return inverterCompressor;
    }

    public void setInverterCompressor(Boolean inverterCompressor) {
        this.inverterCompressor = inverterCompressor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof  Fridge)) {
            return false;
        }
        if (!super.equals(obj)){
            return false;
        }
        Fridge fridge = (Fridge) obj;
        return usefulVolume == fridge.usefulVolume
                && noFrost == fridge.noFrost
                && inverterCompressor.equals(fridge.inverterCompressor);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result * getUsefulVolume();
        result = prime * result * getNoFrost().hashCode();
        result = prime * result * getInverterCompressor().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Fridge {" + super.toString()
                + ", noFrost=" + noFrost
                + ", usefulVolume=" + usefulVolume
                + ", inverterCompressor=" + inverterCompressor
                + '}';
    }
}
