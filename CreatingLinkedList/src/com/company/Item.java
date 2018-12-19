package com.company;

public class Item extends ListItem {
    private String value;
    private ListItem previous;
    private ListItem next;

    public Item(String value) {
        super(value, null, null);
        this.value = value;
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public Object setValue(Object value) {
        return this.value = (String) value;
    }

    @Override
    public ListItem getPrevious() {
        return this.previous;
    }

    @Override
    public ListItem setPrevious(ListItem listItem) {
        return this.previous = listItem;
    }

    @Override
    public ListItem getNext() {
        return this.next;
    }

    @Override
    public ListItem setNext(ListItem listItem) {
        return this.next = listItem;
    }

    @Override
    public int compareTo(ListItem item) {
        return ((String) this.getValue()).compareTo((String) (item.getValue()));
    }
}
