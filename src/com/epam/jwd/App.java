package com.epam.jwd;

import com.epam.jwd.comparator.AppliancesByPowerConsumptionComparator;
import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.entity.flat.Flat;
import com.epam.jwd.logic.FlatCreator;
import com.epam.jwd.logic.PowerConsumptionInFlat;
import com.epam.jwd.logic.search.Operator;
import com.epam.jwd.logic.search.SearchAppliances;

/**
 * Main class of App
 *
 * @author Yauheni Dubovik
 */
public class App {

    /**
     * Main method of App, creating Flat with Appliances inside
     * and check how is work all logic
     *
     * @param args command line values
     */
    public static void main(String[] args) {
        FlatCreator flatCreator = new FlatCreator();
        Flat flat = flatCreator.createFlat();

        System.out.println(flat.toString() + "\n");
        System.out.println(PowerConsumptionInFlat.powerConsumptionEnabledAppliances(flat));
        flat.getListAppliances().sort(new AppliancesByPowerConsumptionComparator());
        System.out.println(flat);

        SearchAppliances sa = new SearchAppliances();
        System.out.println(sa.findBy(Operator.LARGER_THAN, 1200, flat) + "\n");
        System.out.println(sa.findBy(Operator.LESS_THAN, 15.0, flat) + "\n");
        System.out.println(sa.findBy(Brand.SAMSUNG, flat) + "\n");

    }
}
