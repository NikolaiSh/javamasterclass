package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Yorkie");
        dog.breath();
        dog.eat();

        Bird parrot = new Parrot("Australian ringneck");
        parrot.breath();
        parrot.eat();
        parrot.fly();

        Bird penguin = new Penguin("Emperor");
        penguin.breath();
        penguin.fly();
    }
}
