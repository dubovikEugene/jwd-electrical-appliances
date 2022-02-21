package com.epam.jwd.logic.search;

import com.epam.jwd.entity.appliances.Appliances;
import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.entity.flat.Flat;

import java.util.ArrayList;
import java.util.List;

/**
 * Class with searching methods
 *
 * @author Yauheni Dubovik
 * {@link #findBy(Operator, int, Flat)}
 * {@link #findBy(Brand, Flat)}
 * {@link #findBy(Operator, double, Flat)}
 */
public class SearchAppliances {
    /**
     * This method find all Appliances in Flat by power consumption
     * depending on the Operator
     *
     * @param operator         - is operator less, equal or larger
     *                         from {@link Operator}
     * @param powerConsumption - is power consumption by some Appliances
     * @param flat             - is some Flat with difference Appliances
     * @return List of Appliances who fits the given condition with
     * Operator and powerConsumption
     */
    public List<Appliances> findBy(Operator operator, int powerConsumption, Flat flat) {
        List<Appliances> appliancesList = new ArrayList<>();
        switch (operator) {
            case EQUAL:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getPowerConsumption() == powerConsumption) {
                        appliancesList.add(appliances);
                    }
                }
                break;
            case LARGER_THAN:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getPowerConsumption() > powerConsumption) {
                        appliancesList.add(appliances);
                    }
                }
                break;
            case LESS_THAN:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getPowerConsumption() < powerConsumption) {
                        appliancesList.add(appliances);
                    }
                }
                break;
        }
        return appliancesList;
    }

    /**
     * This method find all Appliances in Flat by Brand
     *
     * @param brand - it`s brand by some Appliances
     *              {@link  Brand}
     * @param flat  - is some Flat with difference Appliances
     * @return List of Appliances who fits the given condition
     * with Brand
     */
    public List<Appliances> findBy(Brand brand, Flat flat) {
        List<Appliances> appliancesList = new ArrayList<>();
        for (Appliances appliances : flat.getListAppliances()) {
            if (appliances.getBrand() == brand) {
                appliancesList.add(appliances);
            }
        }
        return appliancesList;
    }

    /**
     * This method find all Appliances in Flat by weight
     * depending on the Operator
     *
     * @param operator - is operator less, equal or larger
     *                 from {@link Operator}
     * @param weight   - is weight by some Appliances
     * @param flat     - is some Flat with difference Appliances
     * @return List of Appliances who fits the given condition with
     * Operator and weight
     */
    public List<Appliances> findBy(Operator operator, double weight, Flat flat) {
        List<Appliances> appliancesList = new ArrayList<>();
        switch (operator) {
            case EQUAL:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getWeight() == weight) {
                        appliancesList.add(appliances);
                    }
                }
                break;
            case LARGER_THAN:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getWeight() > weight) {
                        appliancesList.add(appliances);
                    }
                }
                break;
            case LESS_THAN:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getWeight() < weight) {
                        appliancesList.add(appliances);
                    }
                }
                break;
        }
        return appliancesList;
    }
}
