package com.company;

public abstract class ListItem {
    private Object value;
    private ListItem previous;
    private ListItem next;

    public ListItem(String value, ListItem previous, ListItem next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public abstract Object getValue();
    public abstract Object setValue(Object value);

    public abstract ListItem getPrevious();
    public abstract ListItem setPrevious(ListItem listItem);

    public abstract ListItem getNext();
    public abstract ListItem setNext(ListItem listItem);

    public abstract int compareTo(ListItem item);

}
