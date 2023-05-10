package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        // Declare and initialize an Array of string
        String[] items = {"apples", "bananas", "milk", "eggs"};

        // Transform the above Array into a List of string
        List<String> list = List.of(items);
        System.out.println(list);

        /* Transform the above List into an arrayList of string.
        The difference between a List and an ArrayList is that
        a List is immutable while an ArrayList is mutable */
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        // Create another Arraylist by using a temporary List
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        System.out.println(nextList);

        // addAll is used to add another Arraylist into an existing Arraylist
        groceries.addAll(nextList);
        System.out.println(groceries);

        // When working with an ArrayList, we use get(index) to access an element in that arraylist
        System.out.println("Third item = " + groceries.get(2));

        // Check if the ArrayList contain a specified element
        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }

        // Add an element to the ArrayList
        groceries.add("yogurt");

        // Find the first occurrence of an element in the ArrayList, it would return -1 if not found
        System.out.println("first = " + groceries.indexOf("yogurt"));
        // Find the last occurrence
        System.out.println("first = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);

        // Remove an element from the ArrayList by specifying its index
        groceries.remove(1);
        System.out.println(groceries);

        // Remove an element from the ArrayList by specifying its value
        groceries.remove("yogurt");
        System.out.println(groceries);

        /* Creating a temporary List of some elements that we want to remove from the existing ArrayList,
        then we pass that temporary List into removeAll() method to remove it */
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        // Remove all elements, only keep some specified elements
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        System.out.println(groceries);

        // Remove all elements
        groceries.clear();
        System.out.println(groceries);

        // Check if the ArrayList is empty
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));

        /* Arrays.asList is kinda similar to List.of,
        it creates a temporary List and add it into the existing Arraylist */
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);

        // Sort the ArrayList by ascending order
        groceries.sort(Comparator.naturalOrder());

        System.out.println(groceries);

        // Sort the ArrayList by descending order
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        // Create an Array from an ArrayList
        var groceryArray = groceries.toArray(new String[groceries.size()]);

        System.out.println(Arrays.toString(groceryArray));
    }
}
