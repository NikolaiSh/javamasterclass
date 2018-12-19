package com.company;

import java.util.ArrayList;

public class MyLinkedList {
    private ArrayList<Item> items;

    public MyLinkedList() {
        this.items = new ArrayList<Item>();
    }


    public void add(String value) {
        if(findItem(value) != null) {
            System.out.println("Value '"+ value +"' is already exists on the list.");
            return;
        }

        Item newItem = new Item(value);

        for(Item i: items) {
            //check values
            // ---start---
//            System.out.println(i.getValue());
//            if(i.getNextItem() != null) {
//                System.out.println("  nextItem: " + i.getNextItem().getValue());
//            }
//            if(i.getPreviousItem() != null) {
//                System.out.println("  previousItem: " + i.getPreviousItem().getValue());
//            }
            //---end---

            int comparison = i.compareTo(newItem);
            //System.out.println(newItem.getValue() + " compare to " + i.getValue() + " comparision is "+ comparison);
            if (comparison > 0) {
                newItem.setNextItem(i);
                if(i.getPreviousItem() != null) {
                    newItem.setPreviousItem(i.getPreviousItem());
                    i.getPreviousItem().setNextItem(newItem);
                }
                i.setPreviousItem(newItem);
                items.add(newItem);
                //printList();
                //System.out.println("43 Added " + newItem.getValue() + ", nextItem: " + newItem.getNextItem().getValue());
                sort();

                return;
            } else if (comparison < 0) {
                //if(i.getNextItem() != null)
                 //   System.out.println(i.getNextItem().getValue());

                if(i.getNextItem() != null && i.getNextItem().compareTo(newItem) > 0) {
                    continue;
                } else if (i.getNextItem() == null) {
                    newItem.setPreviousItem(i);
                    i.setNextItem(newItem);
                    //System.out.println("56 Added " + newItem.getValue() + ", previousItem: " + newItem.getPreviousItem().getValue());
                    items.add(newItem);
                    sort();
                    return;
                }
            }
        }
        items.add(newItem);
        //System.out.println("64 Added " + newItem.getValue());
        sort();
    }

    public Item findItem(ListItem item) {
        for(Item i: items){
            if(i.compareTo(item) == 0) {
                return i;
            }
        }
        return null;
    }

    public Item findItem(String value){
        Item newItem = new Item(value);
        for(Item i: items) {
            if(i.compareTo(newItem) == 0) {
                return i;
            }
        }
        return null;
    }



    @Override
    public String toString() {
        String text = "";
        for(Item i: items) {
           // text += "Item " + i.getValue() + ", nextItem: " + i.getNextItem().getValue() + ", previousItem: " + i.getPreviousItem().getValue() +"\n";
            text += "Item " + i.getValue() + "\n";
        }
        return text;
    }

    public class Item extends ListItem {

        public Item(String value) {
            super(value);
        }

        @Override
        public void setNextItem(ListItem listItem) {
            this.nextItem = listItem;
        }

        @Override
        public void setPreviousItem(ListItem listItem) {
            this.previousItem = listItem;
        }

        @Override
        public int compareTo(ListItem listItem) {

            return this.value.compareTo(listItem.getValue());

        }
    }



    public ArrayList<Item> getItems() {
        return items;
    }

    private void sort(){
        boolean quit = false;
        while(!quit) {
            quit = true;
            for(int i = 0; i < items.size() - 1; i++) {
                if(items.get(i).compareTo(items.get(i+1)) > 0) {
                    Item temp = items.get(i);
                    items.set(i, items.get(i+1));
                    items.set(i+1, temp);
                    quit = false;
                }
            }
        }
        //System.out.println("=== Sorted ===");
        //printList();
    }

    public void printList (){
        String text = "";
        for(int i = 0; i < items.size(); i++) {
            text += (i+1) + ". Item: " + items.get(i).getValue() + "\n";
            if(items.get(i).getPreviousItem() != null) {
                text += "  previousItem: " + items.get(i).getPreviousItem().getValue() + "\n";
            } else {
                text += "  previousItem is null\n";
            }
            if(items.get(i).getNextItem() != null) {
                text += "  nextItem: " + items.get(i).getNextItem().getValue() + "\n";
            } else {
                text += "  nextItem is null\n";
            }
        }
        System.out.println(text);
    }


}
