package com.epam.jwd.comparator;

import com.epam.jwd.entity.appliances.Appliances;

import java.util.Comparator;

/**
 * A class for comparing two objects of the Appliances type
 * using the Comparator interface
 *
 * @author Yauheni Dubovik
 */

public class AppliancesByPowerConsumptionComparator implements Comparator<Appliances> {

    /**
     * Compares to appliances by power consumption. Returns a negative integer,
     * zero, or a positive integer as the first argument is less than, equal to,
     * or greater than the second.
     *
     * @param appliances1 first object to be compared
     * @param appliances2 second object to be compared
     * @return negative, zero or positive integer as the first
     * argument is less than, equal to, or greater than the second
     * @see Comparator
     * @see Integer#compare(int, int)
     */
    @Override
    public int compare(Appliances appliances1, Appliances appliances2) {
        return Integer.compare(appliances1.getPowerConsumption(), appliances2.getPowerConsumption());
    }
}
