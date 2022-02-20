package com.epam.jwd.logic.validator.impl;

import com.epam.jwd.entity.appliances.Fridge;
import com.epam.jwd.logic.validator.Validator;

public class FridgeValidator implements Validator<Fridge> {
    @Override
    public void validate(Fridge fridge) {
        validatePowerConsumption(fridge.getPowerConsumption());
        validateWeight(fridge.getWeight());
        validateWidth(fridge.getWidth());
        validateHeight(fridge.getHeight());
        validateUsefulVolume(fridge.getUsefulVolume());

    }

    private void validatePowerConsumption(int powerConsumption) {
        final int minPowerConsumption = 5;
        final int maxPowerConsumption = 140;
        if (powerConsumption <= minPowerConsumption || powerConsumption >= maxPowerConsumption) {
            throw new IllegalArgumentException("power consumption invalid value");
        }
    }

    private void validateWeight(double weight) {
        final double minWeight = 3.5;
        final double maxWeight = 201;
        if (weight <= minWeight || weight >= maxWeight) {
            throw new IllegalArgumentException("weight invalid value");
        }
    }

    private void validateWidth(int width) {
        final int minWidth = 25;
        final int maxWidth = 204;
        if (width <= minWidth || width >= maxWidth) {
            throw new IllegalArgumentException("width invalid value");
        }
    }

    private void validateHeight(int height) {
        final int minHeight = 30;
        final int maxHeight = 221;
        if (height <= minHeight || height >= maxHeight) {
            throw new IllegalArgumentException("height invalid value");
        }
    }

    private void validateUsefulVolume(int usefulVolume) {
        final int minUsefulVolume = 12;
        final int maxUsefulVolume = 785;
        if (usefulVolume <= minUsefulVolume || usefulVolume >= maxUsefulVolume) {
            throw new IllegalArgumentException("usefulVolume invalid value");
        }
    }
}
