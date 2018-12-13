package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveabale {
    private String name;
    private String playerClass;
    private int defence;
    private int attack;

    public Player(String name, String playerClass) {
        this.name = name;
        this.playerClass = playerClass;
        defence = 10;
        attack = 10;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public List<String> saveToMedium() {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add(0, this.name);
        arrayList.add(1, this.playerClass);
        arrayList.add(2, "" + this.defence);
        arrayList.add(3, "" + this.attack);
        return arrayList;
    }

    @Override
    public void populate(List<String> arrayListToPopulate) {
        this.name = arrayListToPopulate.get(0);
        this.playerClass = arrayListToPopulate.get(1);
        this.defence = Integer.parseInt(arrayListToPopulate.get(2));
        this.attack = Integer.parseInt(arrayListToPopulate.get(3));
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", playerClass='" + playerClass + '\'' +
                ", defence=" + defence +
                ", attack=" + attack +
                '}';
    }
}
