package com.epam.jwd.logic;

import com.epam.jwd.entity.appliances.Appliances;
import com.epam.jwd.entity.flat.Flat;


public class PowerConsumptionInFlat {
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
