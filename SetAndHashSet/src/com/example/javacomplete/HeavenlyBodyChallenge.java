package com.example.javacomplete;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBodyChallenge {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBodyChallenge> satellites;


    public HeavenlyBodyChallenge(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addMoon(HeavenlyBodyChallenge moon) {
//        if (this.getBodyType())
        return this.satellites.add(moon);
    }

    public Set<HeavenlyBodyChallenge> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());

        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        HeavenlyBodyChallenge theObj = (HeavenlyBodyChallenge) obj;
        return this.getName().equals(theObj.getName());
    }

    @Override
    public int hashCode() {
//        System.out.println("hashCode() called");
        return this.getName().hashCode() + 57 + this.getClass().hashCode();
    }

    @Override
    public String toString() {
        return this.name + ": " + this.orbitalPeriod;
    }
}
