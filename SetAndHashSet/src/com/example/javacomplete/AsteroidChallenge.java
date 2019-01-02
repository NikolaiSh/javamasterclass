package com.example.javacomplete;

public class AsteroidChallenge extends HeavenlyBodyChallenge {
    private final String bodyType;

    public AsteroidChallenge(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        this.bodyType = "Asteroid";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(!(obj instanceof AsteroidChallenge)) {
            return false;
        }

        AsteroidChallenge newObj = (AsteroidChallenge) obj;

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
