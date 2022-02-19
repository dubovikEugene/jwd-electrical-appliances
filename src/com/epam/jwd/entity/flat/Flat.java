package com.epam.jwd.entity.flat;

import com.epam.jwd.entity.appliances.Appliances;

import java.util.ArrayList;
import java.util.List;

public class Flat {
    private final List<Appliances> listAppliances = new ArrayList<>();

    public List<Appliances> getListAppliances() {
        return listAppliances;
    }

    public boolean addAppliance(Appliances appliances) {
        return listAppliances.add(appliances);
    }

    public boolean removeAppliance(Appliances appliances) {
        return listAppliances.remove(appliances);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Flat flat = (Flat) obj;
        return listAppliances.equals(flat.listAppliances);
    }

    @Override
    public int hashCode() {
        return 31 * listAppliances.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder flatToString = new StringBuilder("\t\tAppliances in flat:\n");
        for (Appliances appliances : getListAppliances()) {
            flatToString.append(appliances.toString()).append("\n");
        }
        return flatToString.toString();
    }
}
