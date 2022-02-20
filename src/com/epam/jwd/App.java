package com.epam.jwd;

import com.epam.jwd.comparator.AppliancesByPowerConsumptionComparator;
import com.epam.jwd.entity.flat.Flat;
import com.epam.jwd.logic.FlatCreator;
import com.epam.jwd.logic.PowerConsumptionInFlat;
import com.epam.jwd.logic.search.Operator;
import com.epam.jwd.logic.search.SearchAppliances;


public class App {
    public static void main(String[] args) {
        FlatCreator flatCreator = new FlatCreator();
        Flat flat = flatCreator.createFlat();

        System.out.println(flat.toString() + "\n");
        System.out.println(PowerConsumptionInFlat.powerConsumptionEnabledAppliances(flat));
        flat.getListAppliances().sort(new AppliancesByPowerConsumptionComparator());
        System.out.println(flat.toString());

        SearchAppliances sa = new SearchAppliances();
        System.out.println(sa.findBy(Operator.LARGER_THAN, 1200, flat));

    }
}
