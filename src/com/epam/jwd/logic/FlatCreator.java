package com.epam.jwd.logic;

import com.epam.jwd.entity.appliances.ElectricKettle;
import com.epam.jwd.entity.appliances.Fridge;
import com.epam.jwd.entity.appliances.Microwave;
import com.epam.jwd.entity.appliances.WashingMachine;
import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.entity.enums.EnergyEfficiency;
import com.epam.jwd.entity.enums.NoFrost;
import com.epam.jwd.entity.flat.Flat;

public class FlatCreator {
    public Flat createFlat(){
        Flat flat = new Flat();
        flat.addAppliance(new ElectricKettle(1500,
                Brand.BEKO,
                1.5,
                true,
                15,
                25,
                EnergyEfficiency.A_PLUS,
                1700));
        flat.addAppliance(new ElectricKettle(700,
                Brand.BRAUN,
                1.5,
                false,
                15,
                25,
                EnergyEfficiency.A_PLUS,
                1700));
        flat.addAppliance(new Microwave(1200,
                Brand.SAMSUNG,
                12.0,
                false,
                25,
                35));
        flat.addAppliance(new Microwave(1750,
                Brand.LG,
                13.0,
                true,
                45,
                30));
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
        flat.addAppliance(new Fridge(1250,
                Brand.SAMSUNG,
                13.0,
                true,
                60,
                180,
                NoFrost.FULL_NO_FROST,
                290,
                true));
    return flat;
    }
}