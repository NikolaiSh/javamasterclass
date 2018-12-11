package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String startEngine(){
        return ("Car engine started");
    }

    public void accelerating () {
        System.out.println("Car is accelerating");
    }

    public void braking() {
        System.out.println("Car is braking");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Fabia extends Car {
    public Fabia() {
        super("Szkoda Fabia", 4);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is started";
    }

    @Override
    public void accelerating() {
        System.out.println("Fabia is accelerating");
    }

    @Override
    public void braking() {
        System.out.println("Fabia is braking");
    }
}

class Mondeo extends Car {
    public Mondeo() {
        super("Ford Mondeo", 6);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is started";
    }

    @Override
    public void accelerating() {
        System.out.println("Mondeo is accelerating");
    }

    @Override
    public void braking() {
        System.out.println("Mondeo is braking");
    }
}

class UndefinedCar extends Car {
    public UndefinedCar() {
        super("Undefined car", 8);
    }

}




public class Main {

    public static void main(String[] args) {
        for(int i=1; i < 4; i++){
            Car car = creatingTheCar(i);
            System.out.println(car.startEngine());
            car.accelerating();
            car.braking();
            System.out.println();
        }
	// write your code here
    }

    public static Car creatingTheCar (int x){
        switch (x)  {
            case 1:
                return new Fabia();
            case 2:
                return new Car("Ford Mondeo", 6){
                    @Override
                    public String startEngine() {
                        return this.getName() + " engine is started";
                    }

                    @Override
                    public void accelerating() {
                        System.out.println("Mondeo is accelerating");
                    }

                    @Override
                    public void braking() {
                        System.out.println("Mondeo is braking");
                    }
                };
            case 3:
                return new UndefinedCar();
        }

        return null;
    }
}
