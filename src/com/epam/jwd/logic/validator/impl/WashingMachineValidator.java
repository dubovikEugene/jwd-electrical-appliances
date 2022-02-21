package com.epam.jwd.logic.validator.impl;

import com.epam.jwd.entity.appliances.WashingMachine;
import com.epam.jwd.logic.validator.Validator;

/**
 * Class implement Validator parameterized by WashingMachine
 * and check fields of WashingMachine to correctness
 *
 * @author Yauheni Dubovik
 * @see Validator
 */
public class WashingMachineValidator implements Validator<WashingMachine> {

    /**
     * Checking fields to correctness data
     *
     * @param washingMachine some object type of WashingMachine
     * @throws IllegalArgumentException if one of fields have
     *                                  incorrect value
     * @see Validator
     */
    @Override
    public void validate(WashingMachine washingMachine) {
        validatePowerConsumption(washingMachine.getPowerConsumption());
        validateWeight(washingMachine.getWeight());
        validateWidth(washingMachine.getWidth());
        validateHeight(washingMachine.getHeight());
        validateLoadingUpKg(washingMachine.getLoadingUpKg());
        validateDepthCm(washingMachine.getDepthCm());
        validateSpin(washingMachine.getSpin());
    }

    /**
     * The method checks that the power consumption is within the
     * specified limits
     *
     * @param powerConsumption - is power consumption of WashingMachine
     * @throws IllegalArgumentException if power consumption less than 60 W
     *                                  or larger than 7120 W
     */
    private void validatePowerConsumption(int powerConsumption) {
        final int minPowerConsumption = 60;
        final int maxPowerConsumption = 7120;
        if (powerConsumption <= minPowerConsumption || powerConsumption >= maxPowerConsumption) {
            throw new IllegalArgumentException("power consumption invalid value");
        }
    }

    /**
     * The method checks that the weight is within the specified limits
     *
     * @param weight - is weight by WashingMachine
     * @throws IllegalArgumentException if weight less than 4.5 kg
     *                                  or larger than 210.0 Kg
     */
    private void validateWeight(double weight) {
        final double minWeight = 4.5;
        final double maxWeight = 210.0;
        if (weight <= minWeight || weight >= maxWeight) {
            throw new IllegalArgumentException("weight invalid value");
        }
    }

    /**
     * The method checks that the width is within the specified limits
     *
     * @param width - is widths by WashingMachine
     * @throws IllegalArgumentException if width less than 33 cm
     *                                  or larger than 130 cm
     */
    private void validateWidth(int width) {
        final int minWidth = 33;
        final int maxWidth = 130;
        if (width <= minWidth || width >= maxWidth) {
            throw new IllegalArgumentException("width invalid value");
        }
    }

    /**
     * The method checks that the height is within the specified limits
     *
     * @param height - is height by WashingMachine
     * @throws IllegalArgumentException if height less than 36 cm
     *                                  or larger than 196 cm
     */
    private void validateHeight(int height) {
        final int minHeight = 36;
        final int maxHeight = 196;
        if (height <= minHeight || height >= maxHeight) {
            throw new IllegalArgumentException("height invalid value");
        }
    }

    /**
     * The method checks that the loading Up Kg is within the specified limits
     *
     * @param loadingUpKg - is loadingUp in Kg by WashingMachine
     * @throws IllegalArgumentException if loadingUpKg less than 2.0 kg
     *                                  or larger than 20.5 kg
     */
    private void validateLoadingUpKg(double loadingUpKg) {
        final double minLoadingUpKg = 2.0;
        final double maxLoadingUpKg = 20.5;
        if (loadingUpKg <= minLoadingUpKg || loadingUpKg >= maxLoadingUpKg) {
            throw new IllegalArgumentException("loadingUpKg invalid value");
        }
    }

    /**
     * The method checks that the depth in cm is within the specified limits
     *
     * @param depthCm - is depth in cm by WashingMachine
     * @throws IllegalArgumentException if depth in Cm less than 29.2 cm
     *                                  or larger than 86.0 cm
     */
    private void validateDepthCm(double depthCm) {
        final double minDepthCm = 29.2;
        final double maxDepthCm = 86.0;
        if (depthCm <= minDepthCm || depthCm >= maxDepthCm) {
            throw new IllegalArgumentException("depthCm invalid value");
        }
    }

    /**
     * The method checks that the spin in min is within the specified limits
     *
     * @param spin - is spin in min by WashingMachine
     * @throws IllegalArgumentException if spin in min less than 300 rpm
     *                                  or larger than 1800 rpm
     */
    private void validateSpin(int spin) {
        final int minSpin = 300;
        final int maxSpin = 1800;
        if (spin <= minSpin || spin >= maxSpin) {
            throw new IllegalArgumentException("height invalid value");
        }
    }
}
