package com.example.javacomplete;

public class PlanetChallenge extends HeavenlyBodyChallenge {
    private final String bodyType;

    public PlanetChallenge(String name, double orbitalPeriod) {
        super(name, orbitalPeriod);
        bodyType = "Planet";
    }


    @Override
    public boolean addMoon(HeavenlyBodyChallenge moon) {
        if(moon == null) {
            return false;
        }

        if (moon instanceof MoonChallenge) {
            return super.addMoon(moon);
        }

//        System.out.println(moon.getClass().getName() + " is not MoonChallenge");
        return false;

    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) {
//            return true;
//        }
//
//        if(!(obj instanceof PlanetChallenge)) {
//            return false;
//        }
//
//        PlanetChallenge newObj = (PlanetChallenge) obj;
//
//        if (newObj.getName().equals(this.getName()) && newObj.getBodyType().equals(this.bodyType)) {
//            return true;
//        }
//
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return this.getName().hashCode() + 57 + this.getBodyType().hashCode();
//    }
//
    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.bodyType;
    }
}
