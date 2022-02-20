package com.epam.jwd.logic.validator.impl;

import com.epam.jwd.entity.appliances.WashingMachine;
import com.epam.jwd.logic.validator.Validator;

public class WashingMachineValidator implements Validator<WashingMachine> {
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

    private void validatePowerConsumption(int powerConsumption) {
        final int minPowerConsumption = 60;
        final int maxPowerConsumption = 7120;
        if (powerConsumption <= minPowerConsumption || powerConsumption >= maxPowerConsumption) {
            throw new IllegalArgumentException("power consumption invalid value");
        }
    }

    private void validateWeight(double weight) {
        final double minWeight = 4.5;
        final double maxWeight = 210.0;
        if (weight <= minWeight || weight >= maxWeight) {
            throw new IllegalArgumentException("weight invalid value");
        }
    }

    private void validateWidth(int width) {
        final int minWidth = 33;
        final int maxWidth = 130;
        if (width <= minWidth || width >= maxWidth) {
            throw new IllegalArgumentException("width invalid value");
        }
    }

    private void validateHeight(int height) {
        final int minHeight = 36;
        final int maxHeight = 196;
        if (height <= minHeight || height >= maxHeight) {
            throw new IllegalArgumentException("height invalid value");
        }
    }

    private void validateLoadingUpKg(double loadingUpKg) {
        final double minLoadingUpKg = 2.0;
        final double maxLoadingUpKg = 20.5;
        if (loadingUpKg <= minLoadingUpKg || loadingUpKg >= maxLoadingUpKg) {
            throw new IllegalArgumentException("loadingUpKg invalid value");
        }
    }

    private void validateDepthCm(double depthCm) {
        final double minDepthCm = 29.2;
        final double maxDepthCm = 86.0;
        if (depthCm <= minDepthCm || depthCm >= maxDepthCm) {
            throw new IllegalArgumentException("depthCm invalid value");
        }
    }

    private void validateSpin(int spin) {
        final int minSpin = 300;
        final int maxSpin = 1800;
        if (spin <= minSpin || spin >= maxSpin) {
            throw new IllegalArgumentException("height invalid value");
        }
    }
}
