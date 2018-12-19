package com.company;

public class BST {
    private BSTItem[] items;



    public BST() {
        this.items = new BSTItem[1];

    }



    public BSTItem newBSTItem(String value) {
        return new BSTItem(value);
    }



    private boolean setBSTLength(int len) {
        if(len > this.items.length) {
            BSTItem[] newItems = new BST.BSTItem[len];
            System.arraycopy(this.items, 0, newItems, 0, this.items.length);
            this.items = newItems;
            return true;
        } else {
            return false;
        }
    }

    private BSTItem findItem(String value) {
        if(items[0] != null) {
            for(BSTItem i: items) {
                if(i.getValue().compareTo(value) == 0) {
                    return i;
                }
            }
        }
        return null;
    }



    private boolean positioning (BSTItem parentItem, BSTItem toPosition) {
        //System.out.println("105 parentBSTItem: " + parentItem.getValue());

        boolean isChecking = true;

        while(isChecking) {

            if(parentItem.compareTo(toPosition) > 0) {

                if (parentItem.getLeft() == null) {
                    //System.out.println("98 parentBSTItem: " + parentBSTItem.getValue());
                    parentItem.setLeft(toPosition);
                    toPosition.setParent(parentItem);
                    //System.out.println("117 parentBSTItem: " + parentItem.getValue() + ", parentBSTItem.getLeft(): " + parentItem.getLeft().getValue());
                    return true;

                } else {
                   // System.out.println("121");
                    positioning(parentItem.getLeft(), toPosition);
                    return true;
                }

            } else {

                if(parentItem.getRight() == null) {
                   // System.out.println("112 parentBSTItem: " + parentBSTItem.getValue());
                    parentItem.setRight(toPosition);
                    toPosition.setParent(parentItem);
                    //System.out.println("132 parentBSTItem: " + parentItem.getValue() + ", parentBSTItem.getRight(): " + parentItem.getRight().getValue());
                    return true;

                } else {
                    positioning(parentItem.getRight(), toPosition);
                    return true;
                }
            }
        }

        if(findItem(toPosition.getValue()) != null){
            return true;
        }
        return false;
    }


    public boolean addBSTItem (String value) {
        if(findItem(value) != null) {
           // System.out.println("Such item already exists");
            return false;
        }

        BSTItem newBSTItem = new BSTItem(value);

        if(items[0] == null) {
            items[0] = newBSTItem;
            return true;
        }

        setBSTLength(this.items.length + 1);

        positioning(items[0], newBSTItem);

        items[items.length - 1] = newBSTItem;

        return true;
    }

    public void printBST() {
        if(items[0] == null) {
            System.out.println("There is nothing to print");
            return;
        }
        for(BSTItem i: items) {
            System.out.println("Item: " + i.getValue());

            if(i.getParent() != null) {
                System.out.println("  parent: " + i.getParent().getValue());
            } else {
                System.out.println("  has no parent");
            }

            if(i.getLeft() != null) {
                System.out.println("  left child: " + i.getLeft().getValue());
            } else {
                System.out.println("  has no left child");
            }

            if(i.getRight() != null) {
                System.out.println("  right child: " + i.getRight().getValue());
            } else {
                System.out.println("  has no right child");
            }
        }
    }

    private class BSTItem {
        private String value;
        private BSTItem left;
        private BSTItem right;
        private BSTItem parent;

        public BSTItem(String value) {
            this.value = value;
        }


        public int compareTo(String value) {
            if (!this.value.isEmpty()) {
                return this.value.compareTo(value);
            }
            return -1;
        }


        public int compareTo (BSTItem item) {
            if (this.getValue() != null) {
                return this.getValue().compareTo(item.getValue());
            }
            return -1;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public void setLeft(BSTItem left) {
            this.left = left;
        }

        public void setRight(BSTItem right) {
            this.right = right;
        }

        public void setParent(BSTItem parent) {
            this.parent = parent;
        }

        public String getValue() {
            return value;
        }

        public BSTItem getLeft() {
            return left;
        }

        public BSTItem getRight() {
            return right;
        }

        public BSTItem getParent() {
            return parent;
        }




    }
}
