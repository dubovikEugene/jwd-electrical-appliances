package com.epam.jwd.logic.validator.impl;

import com.epam.jwd.entity.appliances.Fridge;
import com.epam.jwd.logic.validator.Validator;

/**
 * Class implement Validator parameterized by Fridge
 * and check fields of Fridge to correctness
 *
 * @author Yauheni Dubovik
 * @see Validator
 */
public class FridgeValidator implements Validator<Fridge> {

    /**
     * Checking fields to correctness data
     *
     * @param fridge some object type of Fridge
     * @throws IllegalArgumentException if one of fields have
     *                                  incorrect value
     * @see Validator
     */
    @Override
    public void validate(Fridge fridge) {
        validatePowerConsumption(fridge.getPowerConsumption());
        validateWeight(fridge.getWeight());
        validateWidth(fridge.getWidth());
        validateHeight(fridge.getHeight());
        validateUsefulVolume(fridge.getUsefulVolume());
    }

    /**
     * The method checks that the power consumption is within the
     * specified limits
     *
     * @param powerConsumption - is power consumption of Fridge
     * @throws IllegalArgumentException if power consumption less than 5 W
     *                                  or larger than 140 W
     */
    private void validatePowerConsumption(int powerConsumption) {
        final int minPowerConsumption = 5;
        final int maxPowerConsumption = 140;
        if (powerConsumption <= minPowerConsumption || powerConsumption >= maxPowerConsumption) {
            throw new IllegalArgumentException("power consumption invalid value");
        }
    }

    /**
     * The method checks that the weight is within the specified limits
     *
     * @param weight - is weight by Fridge
     * @throws IllegalArgumentException if weight less than 3.5 kg
     *                                  or larger than 201.0 Kg
     */
    private void validateWeight(double weight) {
        final double minWeight = 3.5;
        final double maxWeight = 201.0;
        if (weight <= minWeight || weight >= maxWeight) {
            throw new IllegalArgumentException("weight invalid value");
        }
    }

    /**
     * The method checks that the width is within the specified limits
     *
     * @param width - is widths by Fridge
     * @throws IllegalArgumentException if width less than 25 cm
     *                                  or larger than 204 cm
     */
    private void validateWidth(int width) {
        final int minWidth = 25;
        final int maxWidth = 204;
        if (width <= minWidth || width >= maxWidth) {
            throw new IllegalArgumentException("width invalid value");
        }
    }

    /**
     * The method checks that the height is within the specified limits
     *
     * @param height - is height by Fridge
     * @throws IllegalArgumentException if height less than 30 cm
     *                                  or larger than 221 cm
     */
    private void validateHeight(int height) {
        final int minHeight = 30;
        final int maxHeight = 221;
        if (height <= minHeight || height >= maxHeight) {
            throw new IllegalArgumentException("height invalid value");
        }
    }

    /**
     * The method checks that the useful volume is within the specified limits
     *
     * @param usefulVolume - is useful Volume by Fridge
     * @throws IllegalArgumentException if useful Volume  less than 12 litres
     *                                  or larger than 785 litres
     */
    private void validateUsefulVolume(int usefulVolume) {
        final int minUsefulVolume = 12;
        final int maxUsefulVolume = 785;
        if (usefulVolume <= minUsefulVolume || usefulVolume >= maxUsefulVolume) {
            throw new IllegalArgumentException("usefulVolume invalid value");
        }
    }
}
