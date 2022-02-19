package com.epam.jwd;

import com.epam.jwd.comparator.AppliancesByPowerConsumptionComparator;
import com.epam.jwd.entity.flat.Flat;
import com.epam.jwd.logic.FlatCreator;
import com.epam.jwd.logic.PowerConsumption;


public class App {
    public static void main(String[] args) {
        FlatCreator flatCreator = new FlatCreator();
        Flat flat = flatCreator.createFlat();

        System.out.println(flat.toString() + "\n");
        System.out.println(PowerConsumption.powerConsumptionEnabledAppliances(flat));
        flat.getListAppliances().sort(new AppliancesByPowerConsumptionComparator());
        System.out.println(flat.toString());
    }
}
