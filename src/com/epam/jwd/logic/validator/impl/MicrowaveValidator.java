package com.epam.jwd.logic.validator.impl;

import com.epam.jwd.entity.appliances.Microwave;
import com.epam.jwd.logic.validator.Validator;

/**
 * Class implement Validator parameterized by Microwave
 * and check fields of Microwave to correctness
 *
 * @author Yauheni Dubovik
 * @see Validator
 */
public class MicrowaveValidator implements Validator<Microwave> {

    /**
     * Checking fields to correctness data
     *
     * @param microwave some object type of Microwave
     * @throws IllegalArgumentException if one of fields have
     *                                  incorrect value
     * @see Validator
     */
    @Override
    public void validate(Microwave microwave) {
        validatePowerConsumption(microwave.getPowerConsumption());
        validateWeight(microwave.getWeight());
        validateWidth(microwave.getWidth());
        validateHeight(microwave.getHeight());
        validateVolumeLitres(microwave.getVolumeLitres());
        validateMicrowavesPower(microwave.getMicrowavesPower());
    }

    /**
     * The method checks that the power consumption is within the
     * specified limits
     *
     * @param powerConsumption - is power consumption of Microwave
     * @throws IllegalArgumentException if power consumption less than 700 W
     *                                  or larger than 3500 W
     */
    private void validatePowerConsumption(int powerConsumption) {
        final int minPowerConsumption = 700;
        final int maxPowerConsumption = 3500;
        if (powerConsumption <= minPowerConsumption || powerConsumption >= maxPowerConsumption) {
            throw new IllegalArgumentException("power consumption invalid value");
        }
    }

    /**
     * The method checks that the weight is within the specified limits
     *
     * @param weight - is weight by Microwave
     * @throws IllegalArgumentException if weight less than 7.8 kg
     *                                  or larger than 41.0 Kg
     */
    private void validateWeight(double weight) {
        final double minWeight = 7.8;
        final double maxWeight = 41.0;
        if (weight <= minWeight || weight >= maxWeight) {
            throw new IllegalArgumentException("weight invalid value");
        }
    }

    /**
     * The method checks that the width is within the specified limits
     *
     * @param width - is widths by Microwave
     * @throws IllegalArgumentException if width less than 39 cm
     *                                  or larger than 446 cm
     */
    private void validateWidth(int width) {
        final int minWidth = 39;
        final int maxWidth = 446;
        if (width < minWidth || width >= maxWidth) {
            throw new IllegalArgumentException("width invalid value");
        }
    }

    /**
     * The method checks that the height is within the specified limits
     *
     * @param height - is height by Microwave
     * @throws IllegalArgumentException if height less than 22 cm
     *                                  or larger than 50 cm
     */
    private void validateHeight(int height) {
        final int minHeight = 22;
        final int maxHeight = 50;
        if (height <= minHeight || height >= maxHeight) {
            throw new IllegalArgumentException("height invalid value");
        }
    }

    /**
     * The method checks that the volume in litres is within the specified limits
     *
     * @param volumeLitres - is Volume by Microwave
     * @throws IllegalArgumentException if Volume less than 13 litres
     *                                  or larger than 53 litres
     */
    private void validateVolumeLitres(int volumeLitres) {
        final int minVolumeLitres = 13;
        final int maxVolumeLitres = 53;
        if (volumeLitres <= minVolumeLitres || volumeLitres >= maxVolumeLitres) {
            throw new IllegalArgumentException("volumeLitres invalid value");
        }
    }

    /**
     * The method checks that the microwaves power is within the specified limits
     *
     * @param microwavesPower - is microwaves power by Microwave
     * @throws IllegalArgumentException if microwavesPower less than 500 litres
     *                                  or larger than 1200 litres
     */
    private void validateMicrowavesPower(int microwavesPower) {
        final int minMicrowavesPower = 500;
        final int maxMicrowavesPower = 1200;
        if (microwavesPower <= minMicrowavesPower || microwavesPower >= maxMicrowavesPower) {
            throw new IllegalArgumentException("microwavesPower invalid value");
        }
    }
}
