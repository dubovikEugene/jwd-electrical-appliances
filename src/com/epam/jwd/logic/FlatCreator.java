package com.epam.jwd.logic;

import com.epam.jwd.entity.appliances.ElectricKettle;
import com.epam.jwd.entity.appliances.Fridge;
import com.epam.jwd.entity.appliances.Microwave;
import com.epam.jwd.entity.appliances.WashingMachine;
import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.entity.enums.EnergyEfficiency;
import com.epam.jwd.entity.enums.NoFrost;
import com.epam.jwd.entity.flat.Flat;
import com.epam.jwd.logic.validator.impl.ElectricKettleValidator;
import com.epam.jwd.logic.validator.impl.FridgeValidator;
import com.epam.jwd.logic.validator.impl.MicrowaveValidator;

public class FlatCreator {
    private final Flat flat = new Flat();
    private final ElectricKettleValidator electricKettleValidator = new ElectricKettleValidator();
    private final FridgeValidator fridgeValidator = new FridgeValidator();
    private final MicrowaveValidator microwaveValidator = new MicrowaveValidator();

    public Flat createFlat() {
        ElectricKettle firstElectricKettle = new ElectricKettle(1500,
                Brand.BEKO,
                1.5,
                true,
                15,
                25,
                EnergyEfficiency.A_PLUS,
                1700);
        electricKettleValidator.validate(firstElectricKettle);

        ElectricKettle secondElectricKettle = new ElectricKettle(1500,
                Brand.BEKO,
                1.5,
                true,
                15,
                25,
                EnergyEfficiency.A_PLUS,
                1700);
        electricKettleValidator.validate(secondElectricKettle);

        Fridge firstFridge = new Fridge(45,
                Brand.SAMSUNG,
                55.5,
                true,
                60,
                180,
                NoFrost.FULL_NO_FROST,
                290,
                true);
        fridgeValidator.validate(firstFridge);

        Microwave firstMicrowave = new Microwave(1200,
                Brand.SAMSUNG,
                12.0,
                false,
                39,
                26,
                30,
                true,
                650,
                true,
                EnergyEfficiency.A_PLUS);
        microwaveValidator.validate(firstMicrowave);

        Microwave secondMicrowave = new Microwave(1750,
                Brand.LG,
                13.0,
                true,
                45,
                30,
                30,
                true,
                650,
                true,
                EnergyEfficiency.A_PLUS);
        microwaveValidator.validate(secondMicrowave);

        flat.addAppliance(firstElectricKettle);
        flat.addAppliance(secondElectricKettle);
        flat.addAppliance(firstMicrowave);
        flat.addAppliance(secondMicrowave);
        flat.addAppliance(new WashingMachine(1200,
                Brand.ATLANT,
                25.5,
                true,
                45,
                60,
                EnergyEfficiency.A_PLUS,
                10,
                45,
                1200));
        flat.addAppliance(firstFridge);
        return flat;
    }

    private void initAppliances(){

    }
}
