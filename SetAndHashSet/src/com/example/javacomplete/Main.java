package com.example.javacomplete;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Earth").addSatellite(solarSystem.get("Moon"));

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Mars").addSatellite(solarSystem.get("Deimos"));

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Mars").addSatellite(solarSystem.get("Phobos"));

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Jupiter").addSatellite(solarSystem.get("Io"));

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Jupiter").addSatellite(solarSystem.get("Europa"));

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Jupiter").addSatellite(solarSystem.get("Ganymede"));

        tempMoon = new Moon("Callisto", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        solarSystem.get("Jupiter").addSatellite(solarSystem.get("Callisto"));

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new Star("Sun", 225000000);
        solarSystem.put(temp.getName(), temp);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
//            if (planet.getSatellites().size() > 0) {
//                for (HeavenlyBody satellite : planet.getSatellites()) {
//                    System.out.println("\t\t" + satellite.getName());
//                }
//            }
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for (HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All moons");
        for (HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new Asteroid("Pluto", 845);
        solarSystem.put(pluto.getName(), pluto);
        planets.add(pluto);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName() + ": " + planet.getOrbitalPeriod());
//            if (planet.getSatellites().size() > 0) {
//                for (HeavenlyBody satellite : planet.getSatellites()) {
//                    System.out.println("\t\t" + satellite.getName());
//                }
//            }
        }

        System.out.println(solarSystem.get("Earth").toString());
        System.out.println(solarSystem.get("Pluto").toString());

        for(HeavenlyBody ss : solarSystem.values()) {
            System.out.println(ss);
        }




    }
}
