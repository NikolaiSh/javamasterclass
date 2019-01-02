package com.example.javacomplete;

import java.util.Set;

public class StarChallenge extends HeavenlyBodyChallenge {
    private final String bodyType;

    public StarChallenge(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        this.bodyType = "Star";
    }

    public void addMoons(Set<? extends HeavenlyBodyChallenge> set) {
        for(HeavenlyBodyChallenge heavenlyBodyChallenge : set) {
            this.addMoon(heavenlyBodyChallenge);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof StarChallenge)) {
            return false;
        }

        StarChallenge newObj = (StarChallenge) obj;

        if (newObj.getName().equals(this.getName()) && newObj.getBodyType().equals(this.bodyType)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() + 57 + this.getBodyType().hashCode();
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.bodyType;
    }
}
