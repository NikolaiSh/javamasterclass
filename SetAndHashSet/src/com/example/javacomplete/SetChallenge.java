package com.example.javacomplete;

import java.util.*;

public class SetChallenge {

    private static Map<String, HeavenlyBodyChallenge> solarSystem = new HashMap<>();
    private static Set<PlanetChallenge> planets = new HashSet<>();
    private static Set<MoonChallenge> moons = new HashSet<>();
    private static Set<StarChallenge> stars = new HashSet<>();
    private static Set<AsteroidChallenge> asteroids = new HashSet<>();

    public static void main(String[] args) {

        PlanetChallenge tempPlanet = new PlanetChallenge("Mercury", 88);
        planets.add(tempPlanet);
        solarSystem.put(tempPlanet.getName() + " " + tempPlanet.getBodyType(), tempPlanet);

        tempPlanet = new PlanetChallenge("Venus", 225);
        planets.add(tempPlanet);
        solarSystem.put(tempPlanet.getName() + " " + tempPlanet.getBodyType(), tempPlanet);

        tempPlanet = new PlanetChallenge("Earth", 365);
        planets.add(tempPlanet);
        solarSystem.put(tempPlanet.getName() + " " + tempPlanet.getBodyType(), tempPlanet);

        MoonChallenge tempMoon = new MoonChallenge("Moon", 27);
        moons.add(tempMoon);
        solarSystem.put(tempMoon.getName() + " " + tempMoon.getBodyType(), tempMoon);
        tempPlanet.addMoon(tempMoon);

        tempPlanet = new PlanetChallenge("Pluto", 248);
        planets.add(tempPlanet);
        solarSystem.put(tempPlanet.getName() + " " + tempPlanet.getBodyType(), tempPlanet);

        tempPlanet = new PlanetChallenge("Mars", 687);
        planets.add(tempPlanet);
        solarSystem.put(tempPlanet.getName() + " " + tempPlanet.getBodyType(), tempPlanet);

        tempPlanet = new PlanetChallenge("Jupiter", 4332);
        planets.add(tempPlanet);
        solarSystem.put(tempPlanet.getName() + " " + tempPlanet.getBodyType(), tempPlanet);

        tempPlanet = new PlanetChallenge("Saturn", 10759);
        planets.add(tempPlanet);
        solarSystem.put(tempPlanet.getName() + " " + tempPlanet.getBodyType(), tempPlanet);

        tempPlanet = new PlanetChallenge("Neptune", 165);
        planets.add(tempPlanet);
        solarSystem.put(tempPlanet.getName() + " " + tempPlanet.getBodyType(), tempPlanet);

        tempPlanet = new PlanetChallenge("Pluto", 300);
        planets.add(tempPlanet);


        for(PlanetChallenge planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getBodyType() + ", " + planet.getOrbitalPeriod());
        }

//        for (MoonChallenge moon : moons) {
//            System.out.println(moon.getName() + ": getClass() = " + moon.getBodyType());
//        }

//        for(MoonChallenge moon : ((Set<MoonChallenge>) solarSystem.get("Earth").getSatellites())) {
//            System.out.println(moon.getName() + ": " + moon.getBodyType());
//        }

//        System.out.println(solarSystem.get("Pluto Planet").getName() + ": " + solarSystem.get("Pluto").getOrbitalPeriod());

        AsteroidChallenge tempAsteroid = new AsteroidChallenge("Pluto", 815);
        solarSystem.put(tempAsteroid.getName() + " " + tempAsteroid.getBodyType(), tempAsteroid);
        asteroids.add(tempAsteroid);
        System.out.println(solarSystem.get("Pluto Asteroid").getName() + ": " + solarSystem.get("Pluto Asteroid").getOrbitalPeriod());

        tempMoon = new MoonChallenge("Europa", 3.5);
        moons.add(tempMoon);
        solarSystem.put(tempMoon.getName() + " " + tempMoon.getBodyType(), tempMoon);
        solarSystem.get("Jupiter Planet").addMoon(solarSystem.get("Europa Moon"));

        tempMoon = new MoonChallenge("Ganymede", 7.1);
        moons.add(tempMoon);
        solarSystem.put(tempMoon.getName() + " " + tempMoon.getBodyType(), tempMoon);
        solarSystem.get("Jupiter Planet").addMoon(solarSystem.get("Ganymede Moon"));

        tempMoon = new MoonChallenge("Callisto", 7.1);
        moons.add(tempMoon);
        solarSystem.put(tempMoon.getName() + " " + tempMoon.getBodyType(), tempMoon);
        solarSystem.get("Jupiter Planet").addMoon(solarSystem.get("Callisto Moon"));

        tempPlanet = new PlanetChallenge("Pluto", 699);
        solarSystem.put(tempPlanet.getName() + " " + tempPlanet.getBodyType(), tempPlanet);

        HeavenlyBodyChallenge earth1 = new PlanetChallenge("Earth", 365);
        HeavenlyBodyChallenge earth2 = new PlanetChallenge("Earth", 364);

        System.out.println(earth1.equals(earth2));
        System.out.println(earth2.equals(earth1));
        System.out.println(earth2.equals(tempPlanet));
        System.out.println(tempPlanet.equals(earth2));

        StarChallenge tempStar = new StarChallenge("Sun", 0.0);
        solarSystem.put(tempStar.getName() + " " + tempStar.getBodyType(), tempStar);
        tempStar.addMoons(planets);
        tempStar.addMoons(moons);
        tempStar.addMoons(asteroids);

        System.out.println("Solar system:");
        for(HeavenlyBodyChallenge ss : solarSystem.values()) {
            System.out.println("\t"+ss);
        }

        System.out.println("Sun`s moons:");
        for(HeavenlyBodyChallenge sm : tempStar.getSatellites()) {
            if (sm instanceof MoonChallenge) {
                MoonChallenge newMoon = (MoonChallenge) sm;
                System.out.println("\t" + newMoon.getName() + ": " + newMoon.getBodyType());
            }

            if (sm instanceof PlanetChallenge) {
                PlanetChallenge newMoon = (PlanetChallenge) sm;
                System.out.println("\t" + newMoon.getName() + ": " + newMoon.getBodyType());
            }

            if (sm instanceof AsteroidChallenge) {
                AsteroidChallenge newMoon = (AsteroidChallenge) sm;
                System.out.println("\t" + newMoon.getName() + ": " + newMoon.getBodyType());
            }

        }









    }
}
