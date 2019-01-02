package com.example.javacomplete;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final BodyType bodyType;

    public enum BodyType {
        STAR, PLANET, MOON, ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyType bodyType) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody satellite) {
//        if (this.getBodyType())
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

//        System.out.println("obj.getClass() is " + obj.getClass());
//        System.out.println("this.getClass() is " + this.getClass());

        if (!(obj instanceof HeavenlyBody)) {
            return false;
        }

        HeavenlyBody newObj = (HeavenlyBody) obj;
        if (newObj.getName().equals(this.getName())) {
            return newObj.getBodyType() == this.bodyType;
        }
        return false;

    }

    @Override
    public int hashCode() {
//        System.out.println("hashCode() called");
        int result = 17;
        result = result * 37 + this.getName().hashCode();
        result = result * 37 + this.getBodyType().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getBodyType() + ", " + this.getOrbitalPeriod();
    }
}

