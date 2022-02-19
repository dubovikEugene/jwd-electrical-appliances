package com.epam.jwd.comparator;

import com.epam.jwd.entity.appliances.Appliances;

import java.util.Comparator;

public class AppliancesByPowerConsumptionComparator implements Comparator<Appliances> {
    @Override
    public int compare(Appliances appliances1, Appliances appliances2) {
        return Integer.compare(appliances1.getPowerConsumption(), appliances2.getPowerConsumption());
    }
}
