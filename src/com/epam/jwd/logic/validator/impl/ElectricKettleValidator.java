package com.epam.jwd.logic.validator.impl;

import com.epam.jwd.entity.appliances.Appliances;
import com.epam.jwd.entity.appliances.ElectricKettle;
import com.epam.jwd.logic.validator.Validator;

public class ElectricKettleValidator implements Validator<ElectricKettle> {

    @Override
    public void validate(ElectricKettle electricKettle) {
        validatePowerConsumption(electricKettle.getPowerConsumption());
        validateWeight(electricKettle.getWeight());
        validateWidth(electricKettle.getWidth());
        validateHeight(electricKettle.getHeight());
        validateVolumeMillilitres(electricKettle.getVolumeMillilitres());
    }

    private void validatePowerConsumption(int powerConsumption) {
        final int minPowerConsumption = 120;
        final int maxPowerConsumption = 3000;
        if (powerConsumption <= minPowerConsumption || powerConsumption >= maxPowerConsumption) {
            throw new IllegalArgumentException("power consumption invalid value");
        }
    }

    private void validateWeight(double weight) {
        final double minWeight = 0.5;
        final double maxWeight = 50;
        if (weight <= minWeight || weight >= maxWeight) {
            throw new IllegalArgumentException("weight invalid value");
        }
    }

    private void validateWidth(int width) {
        final int minWidth = 1;
        if (width <= minWidth) {
            throw new IllegalArgumentException("width invalid value");
        }
    }

    private void validateHeight(int height) {
        final int minHeight = 1;
        if (height <= minHeight) {
            throw new IllegalArgumentException("height invalid value");
        }
    }

    private void validateVolumeMillilitres(int volumeMillilitres) {
        final int minVolumeMillilitres = 400;
        final int maxVolumeMillilitres = 5000;
        if (volumeMillilitres <= minVolumeMillilitres || volumeMillilitres >= maxVolumeMillilitres) {
            throw new IllegalArgumentException("VolumeMillilitres invalid value");
        }
    }
}
