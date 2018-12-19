package com.company;

public abstract class ListItem {
    ListItem previousItem;
    ListItem nextItem;
    String value;

    public ListItem(String value) {
        this.value = value;
    }

    public ListItem getPreviousItem() {
        return previousItem;
    }

    public ListItem getNextItem() {
        return nextItem;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public abstract int compareTo(ListItem listItem);

    public ListItem moveToNext() {
        return nextItem;
    };

    public ListItem moveToPrevious() {
        return previousItem;
    }

    public abstract void setNextItem(ListItem listItem);

    public void setPreviousItem(ListItem listItem){
        this.previousItem = listItem;
    }
}
