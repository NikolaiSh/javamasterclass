package com.example.javacomplete;

import java.util.HashSet;
import java.util.Set;

public class Planet extends HeavenlyBody{

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if(satellite instanceof Moon) {
//            Moon newMoon = (Moon) satellite;
            super.addSatellite(satellite);
            return true;
        }
        return false;
    }

}
