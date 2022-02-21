package com.epam.jwd.logic;

import com.epam.jwd.entity.appliances.Appliances;
import com.epam.jwd.entity.flat.Flat;

/**
 * A class for finding the sum of the power consumption
 * of the included electrical appliances
 */
public class PowerConsumptionInFlat {

    /**
     * This method find all enabled Appliances and then calculates the
     * amount of power consumption
     *
     * @param flat where to calculate the power of the enabled Appliances
     * @return integer sum of power consumption of all enabled Appliances
     */
    public static int powerConsumptionEnabledAppliances(Flat flat) {
        int powerConsumption = 0;
        for (Appliances appliances : flat.getListAppliances()) {
            if (appliances.isEnabled()) {
                powerConsumption += appliances.getPowerConsumption();
            }
        }
        return powerConsumption;
    }


}
