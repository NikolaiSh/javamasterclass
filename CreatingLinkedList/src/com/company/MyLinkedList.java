package com.company;

import javax.sound.midi.Soundbank;

public class MyLinkedList {
    private Item head;

    public MyLinkedList() {
        this.head = null;
    }

    public boolean addItem(Item item) {
        if (findItem(item)) {
            System.out.println("Item " + item.getValue() + " is already on the list");
            return false;
        }

        if(head == null) {
            head = item;
            return true;
        }

        Item currentItem = this.head;
        while(currentItem != null) {
            if(currentItem.compareTo(item) > 0) {
                if(currentItem.getPrevious() != null) {
                    item.setPrevious(currentItem.getPrevious()).setNext(item);
                } else {
                    this.head = item;
                    item.setPrevious(null);
                }
                item.setNext(currentItem).setPrevious(item);
                return true;
            } else if (currentItem.compareTo(item) < 0) {
                if(currentItem.getNext() != null) {
                    currentItem = (Item) currentItem.getNext();
                    continue;
                } else {
                    item.setPrevious(currentItem).setNext(item);
                    item.setNext(null);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeItem(String value) {
        if(!findItem(value)) {
            System.out.println("There is nothing to remove");
            return false;
        }

        System.out.println("Remove " + value);

        Item currentItem = this.head;
        while(currentItem != null) {
            int comparision = ((String)currentItem.getValue()).compareTo(value);
            if(comparision == 0) {
                if(currentItem == this.head && currentItem.getNext() == null) {
                    head = null;
                    return true;
                }
                if(currentItem.getPrevious() == null) {
                    this.head = (Item)currentItem.getNext();
                    currentItem.getNext().setPrevious(null);
                    return true;
                }
                if(currentItem.getNext() == null) {
                    currentItem.getPrevious().setNext(null);
                    return true;
                }
                currentItem.getPrevious().setNext(currentItem.getNext()).setPrevious(currentItem.getPrevious());
            }
            if (comparision < 0 && currentItem.getNext() != null) {
                currentItem = (Item) currentItem.getNext();
            } else {
                return false;
            }
        }
        return false;
    }

    private boolean findItem(String value) {
        Item currentItem = head;
        while (currentItem != null) {
            int comparison = ((String) currentItem.getValue()).compareTo(value);
            if(comparison == 0) {
                return true;
            } else if(currentItem.getNext() != null) {
                currentItem = (Item) currentItem.getNext();
            } else {
                break;
            }
        }
        return false;
    }

    private boolean findItem(Item item) {
        Item currentItem = head;
        while (currentItem != null) {
            if(currentItem.compareTo(item) == 0) {
                return true;
            } else if(currentItem.getNext() != null) {
                currentItem = (Item) currentItem.getNext();
            } else {
                break;
            }
        }
        return false;
    }

    public void printMyLinkedList () {
        if(head == null) {
            System.out.println("There is nothing to print");
        }

        System.out.println("HEAD: " + this.head.getValue());

        Item currentItem = head;
        int index = 0;
        while(currentItem != null) {
            System.out.println(index + ". " + currentItem.getValue());
            if(currentItem.getPrevious() != null) {
                System.out.println("  previous: " + currentItem.getPrevious().getValue());
            } else {
                System.out.println("  previous is null");
            }

            if(currentItem.getNext() != null) {
                System.out.println("  next: " + currentItem.getNext().getValue());
                currentItem = (Item) currentItem.getNext();
                index++;
            } else {
                System.out.println("  next is null");
                return;
            }
        }
    }
}
