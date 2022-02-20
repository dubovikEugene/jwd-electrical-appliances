package com.epam.jwd.logic.validator.impl;

import com.epam.jwd.entity.appliances.Microwave;
import com.epam.jwd.logic.validator.Validator;

public class MicrowaveValidator implements Validator<Microwave> {
    @Override
    public void validate(Microwave microwave) {
        validatePowerConsumption(microwave.getPowerConsumption());
        validateWeight(microwave.getWeight());
        validateWidth(microwave.getWidth());
        validateHeight(microwave.getHeight());
        validateVolumeLitres(microwave.getVolumeLitres());
        validateMicrowavesPower(microwave.getMicrowavesPower());
    }

    private void validatePowerConsumption(int powerConsumption) {
        final int minPowerConsumption = 700;
        final int maxPowerConsumption = 3500;
        if (powerConsumption <= minPowerConsumption || powerConsumption >= maxPowerConsumption) {
            throw new IllegalArgumentException("power consumption invalid value");
        }
    }

    private void validateWeight(double weight) {
        final double minWeight = 7.8;
        final double maxWeight = 41;
        if (weight <= minWeight || weight >= maxWeight) {
            throw new IllegalArgumentException("weight invalid value");
        }
    }

    private void validateWidth(int width) {
        final int minWidth = 39;
        final int maxWidth = 446;
        if (width < minWidth || width >= maxWidth) {
            throw new IllegalArgumentException("width invalid value");
        }
    }

    private void validateHeight(int height) {
        final int minHeight = 22;
        final int maxHeight = 50;
        if (height <= minHeight || height >= maxHeight) {
            throw new IllegalArgumentException("height invalid value");
        }
    }

    private void validateVolumeLitres(int volumeLitres) {
        final int minVolumeLitres = 13;
        final int maxVolumeLitres = 53;
        if (volumeLitres <= minVolumeLitres || volumeLitres >= maxVolumeLitres) {
            throw new IllegalArgumentException("height invalid value");
        }
    }

    private void validateMicrowavesPower(int microwavesPower) {
        final int minMicrowavesPower = 500;
        final int maxMicrowavesPower = 1200;
        if (microwavesPower <= minMicrowavesPower || microwavesPower >= maxMicrowavesPower) {
            throw new IllegalArgumentException("height invalid value");
        }
    }
}
