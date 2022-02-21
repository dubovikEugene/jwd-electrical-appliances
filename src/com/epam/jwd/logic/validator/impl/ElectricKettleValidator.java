package com.epam.jwd.logic.validator.impl;

import com.epam.jwd.entity.appliances.ElectricKettle;
import com.epam.jwd.logic.validator.Validator;

/**
 * Class implement Validator parameterized by ElectricKettle
 * and check fields of ElectricKettle to correctness
 *
 * @author Yauheni Dubovik
 * @see Validator
 */

public class ElectricKettleValidator implements Validator<ElectricKettle> {

    /**
     * Checking fields to correctness data
     *
     * @param electricKettle some object type of ElectricKettle
     * @throws IllegalArgumentException if one of fields have
     *                                  incorrect value
     * @see Validator
     */
    @Override
    public void validate(ElectricKettle electricKettle) {
        validatePowerConsumption(electricKettle.getPowerConsumption());
        validateWeight(electricKettle.getWeight());
        validateWidth(electricKettle.getWidth());
        validateHeight(electricKettle.getHeight());
        validateVolumeMillilitres(electricKettle.getVolumeMillilitres());
    }

    /**
     * The method checks that the power consumption is within the
     * specified limits
     *
     * @param powerConsumption - is power consumption of ElectricKettle
     * @throws IllegalArgumentException if power consumption less than 120 W
     *                                  or larger than 3000 W
     */
    private void validatePowerConsumption(int powerConsumption) {
        final int minPowerConsumption = 120;
        final int maxPowerConsumption = 3000;
        if (powerConsumption <= minPowerConsumption
                || powerConsumption >= maxPowerConsumption) {
            throw new IllegalArgumentException("power consumption invalid value");
        }
    }

    /**
     * The method checks that the weight is within the specified limits
     *
     * @param weight - is weight by ElectricKettle
     * @throws IllegalArgumentException if weight less than 0.5 kg
     *                                  or larger than 50 Kg
     */

    private void validateWeight(double weight) {
        final double minWeight = 0.5;
        final double maxWeight = 50;
        if (weight <= minWeight || weight >= maxWeight) {
            throw new IllegalArgumentException("weight invalid value");
        }
    }

    /**
     * The method checks that the width is within the specified limits
     *
     * @param width - is widths by ElectricKettle
     * @throws IllegalArgumentException if width less than 1 cm
     */
    private void validateWidth(int width) {
        final int minWidth = 1;
        if (width <= minWidth) {
            throw new IllegalArgumentException("width invalid value");
        }
    }

    /**
     * The method checks that the height is within the specified limits
     *
     * @param height - is height by ElectricKettle
     * @throws IllegalArgumentException if height less than 5 cm
     */
    private void validateHeight(int height) {
        final int minHeight = 5;
        if (height <= minHeight) {
            throw new IllegalArgumentException("height invalid value");
        }
    }

    /**
     * The method checks that the volume is within the specified limits
     *
     * @param volumeMillilitres - is volume in millilitres by ElectricKettle
     * @throws IllegalArgumentException if volume less than 400 ml
     *                                  or larger than 5000 ml
     */
    private void validateVolumeMillilitres(int volumeMillilitres) {
        final int minVolumeMillilitres = 400;
        final int maxVolumeMillilitres = 5000;
        if (volumeMillilitres <= minVolumeMillilitres || volumeMillilitres >= maxVolumeMillilitres) {
            throw new IllegalArgumentException("VolumeMillilitres invalid value");
        }
    }
}
