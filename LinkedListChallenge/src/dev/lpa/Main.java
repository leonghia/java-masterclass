package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static LinkedList<Place> placesToVisit = new LinkedList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;

        addPlace(new Place("Sydney", 0));
        addPlace(new Place("Adelaide", 1374));
        addPlace(new Place("Alice Springs", 2771));
        addPlace(new Place("Brisbane", 917));
        addPlace(new Place("Darwin", 3972));
        addPlace(new Place("Melbourne", 877));
        addPlace(new Place("Perth", 3923));

        System.out.println("""
                ======== Welcome to Australia ========
                1. Travel forward
                2. Travel backward
                3. List all places
                4. Quit""");

        var listIterator = placesToVisit.listIterator();
        int lastElementIndex = placesToVisit.size() - 1;
        boolean hasJustForwarded = false;
        boolean isAlreadyForwardedOnce = false;
        Place start = null;
        Place end = null;
        System.out.println("You are currently at " + listIterator.next() + " – the start of our journey");
        while (!isQuit) {
            System.out.print("Select a menu (1 - 4): ");
            int select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1 -> {
                    System.out.println("Travelling forward.................");
                    if (listIterator.nextIndex() == lastElementIndex) {
                        end = listIterator.next();
                    }
                    if (!hasJustForwarded && isAlreadyForwardedOnce) {
                        listIterator.next();
                    }
                    System.out.println("You are currently at " + (listIterator.hasNext() ? listIterator.next() : end + " – the end of our journey"));
                    isAlreadyForwardedOnce = true;
                    hasJustForwarded = true;
                }
                case 2 -> {
                    System.out.println("Travelling backward.................");
                    if (listIterator.previousIndex() == 0) {
                        start = listIterator.previous();
                    }
                    if (hasJustForwarded) {
                        listIterator.previous();
                    }
                    System.out.println("You are currently at " + (listIterator.hasPrevious() ? listIterator.previous() : start + " – the start of our journey"));
                    hasJustForwarded = false;
                }
                case 3 -> {
                    System.out.println("Listing all places in our journey.................");
                    System.out.println(placesToVisit);
                }
                case 4 -> {
                    isQuit = true;
                }
            }
        }

    }

    private static void addPlace(Place place) {
        if (isDuplicated(place)) {
            return;
        }
        int i = 0;
        for (Place element : placesToVisit) {
            if (element.getDistance() > place.getDistance()) {
                placesToVisit.add(i, place);
                return;
            }
            i++;
        }
        placesToVisit.add(place);
    }

    private static boolean isDuplicated(Place place) {
        for (Place element : placesToVisit) {
            if (element.getName().equalsIgnoreCase(place.getName())) {
                return true;
            }
        }
        return false;
    }

}

class Place {

    private String name;
    private int distance;

    public Place(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}