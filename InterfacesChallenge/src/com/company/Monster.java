package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveabale {
    private String name;
    private int attack;
    private int defence;
    private boolean isMagic;

    public Monster(String name, int attack, int defence, boolean isMagic) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.isMagic = isMagic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public boolean isMagic() {
        return isMagic;
    }

    public void setIsMagic(boolean magic) {
        isMagic = magic;
    }

    @Override
    public List<String> saveToMedium() {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add(0, name);
        arrayList.add(1, "" + attack);
        arrayList.add(2, "" + defence);
        arrayList.add(3, "" + isMagic);

        return arrayList;
    }

    @Override
    public void populate(List<String> arrayListToPopulate) {
        this.name = arrayListToPopulate.get(0);
        this.attack = Integer.parseInt(arrayListToPopulate.get(1));
        this.defence = Integer.parseInt(arrayListToPopulate.get(2));
        this.isMagic = Boolean.parseBoolean(arrayListToPopulate.get(3));
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", defence=" + defence +
                ", isMagic=" + isMagic +
                '}';
    }
}
