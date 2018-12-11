import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();

        //code before addInOrder method added

//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Spring");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);

        //code after addInOrder method added

        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Sydney");

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            System.out.println("Now visiting " + iterator.next());
        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> listIterator = linkedList.listIterator();
        while(listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(newCity);
            if(comparison == 0){ //equal, do not add
                System.out.println(newCity + " already is included as a destination");
                return false;
            } else if(comparison > 0) { //new City should appear before this one
                //as we already have used .next() method, the cursor is on the after next item
                //to return to the item we need, we are using .previous() method of ListIterator
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            } //else if(comparison < 0) new City should appear before this one
                //as we already have used .next() method, the cursor is on the after next item
                // i.e. on the right position, so we could just add new City to the list
        }

        listIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        ListIterator<String> listIterator = cities.listIterator();
        Scanner scanner = new Scanner(System.in);

        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        boolean quit = false;
        boolean goingForward = true;

        while(!quit) {
            System.out.print("Enter your choice (3 - print instruction): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    System.out.println("Vacation is over");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the END of the list");
                        goingForward = false;
                    }

                    break;
                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("Reached the BEGINING of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("0 - quit\n" +
                "1 - next city\n" +
                "2 - previous city\n" +
                "3 - print menu");
    }
}
