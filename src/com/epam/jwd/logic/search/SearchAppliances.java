package com.epam.jwd.logic.search;

import com.epam.jwd.entity.appliances.Appliances;
import com.epam.jwd.entity.enums.Brand;
import com.epam.jwd.entity.flat.Flat;

import java.util.ArrayList;
import java.util.List;

public class SearchAppliances {

    public List<Appliances> findBy( Operator operator, int powerConsumption, Flat flat) {
        List<Appliances> appliancesList = new ArrayList<>();
        switch (operator) {
            case EQUAL:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getPowerConsumption() == powerConsumption) {
                        appliancesList.add(appliances);
                    }
                }
                break;
            case LARGER_THAN:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getPowerConsumption() > powerConsumption) {
                        appliancesList.add(appliances);
                    }
                }
                break;
            case LESS_THAN:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getPowerConsumption() < powerConsumption) {
                        appliancesList.add(appliances);
                    }
                }
                break;
        }
        return appliancesList;
    }

    public List<Appliances> findBy(Brand brand, Flat flat) {
        List<Appliances> appliancesList = new ArrayList<>();
        for (Appliances appliances : flat.getListAppliances()) {
            if (appliances.getBrand() == brand) {
                appliancesList.add(appliances);
            }
        }
        return appliancesList;
    }

    public List<Appliances> findBy(Operator operator, double weight, Flat flat) {
        List<Appliances> appliancesList = new ArrayList<>();
        switch (operator) {
            case EQUAL:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getWeight() == weight) {
                        appliancesList.add(appliances);
                    }
                }
                break;
            case LARGER_THAN:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getWeight() > weight) {
                        appliancesList.add(appliances);
                    }
                }
                break;
            case LESS_THAN:
                for (Appliances appliances : flat.getListAppliances()) {
                    if (appliances.getWeight() < weight) {
                        appliancesList.add(appliances);
                    }
                }
                break;
        }
        return appliancesList;
    }
}
