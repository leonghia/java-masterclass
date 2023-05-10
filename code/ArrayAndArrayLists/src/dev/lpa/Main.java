package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /* Creating an array then use that array to create a list.
        Be aware that any changes made to this list would also affect the array */
        String[] originalArray = new String[] {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        // Below are some examples to demonstrate the mentioned above behavior
        originalList.set(0, "one"); // set the first element of the list, this would affect the array as well
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder()); // sort the elements of the list, this would affect the array as well
        System.out.println("array: " + Arrays.toString(originalArray));

        /* We are trying to remove/add an element from the list.
        However, since the list is backed by the array, also the array
        is not resizable, we cannot do that */
        originalList.remove(0);
        originalList.add("fourth");

        // Bottom line, the list we created is a fixed size list

        /* We can use Arrays.asList to create a fixed size list.
        The reason why we would do this is we want to use the methods
        on the List interface */
        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

        // Creating an array from an arrayList
        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
        String[] stringArray = stringLists.toArray(new String[0]);
        System.out.println(Arrays.toString(stringArray));
    }
}
