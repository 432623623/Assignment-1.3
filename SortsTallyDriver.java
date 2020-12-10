import java.util.*;
import java.io.*;

/**
 * Executes bubbleSort, bubbleSort2, and shellSort on random lists
 * and sorted lists. Records total number of comparisons and total execution time.
 * @author Patrick Song T00614298
 */

public class SortsTallyDriver {
    public static void main(String[] args) {

        // sort random list of 10 items
        Integer[] list10 = SortProcess.randList(10);
        SortProcess.performSort(list10,"bubbleSort");
        SortProcess.performSort(list10,"bubbleSort2");
        SortProcess.performSort(list10,"shellSort");
        System.out.println("*****************************************************************************\n\n");

        // sort random list of 100 items
        Integer[] list100 = SortProcess.randList(100);
        SortProcess.performSort(list100,"bubbleSort");
        SortProcess.performSort(list100,"bubbleSort2");
        SortProcess.performSort(list100,"shellSort");
        System.out.println("*****************************************************************************\n\n");

        // sort random list of 1000 items
        Integer[] list1000 = SortProcess.randList(1000);
        SortProcess.performSort(list1000,"bubbleSort");
        SortProcess.performSort(list1000,"bubbleSort2");
        SortProcess.performSort(list1000,"shellSort");
        System.out.println("*****************************************************************************\n\n");

        // sort sorted list of 10 items
        Integer[] sortedList10 = SortProcess.sortedList(10);
        SortProcess.performSort(sortedList10,"bubbleSort");
        SortProcess.performSort(sortedList10,"bubbleSort2");
        SortProcess.performSort(sortedList10,"shellSort");
        System.out.println("*****************************************************************************\n\n");

        // sort sorted list of 100 items
        Integer[] sortedList100 = SortProcess.sortedList(100);
        SortProcess.performSort(sortedList100,"bubbleSort");
        SortProcess.performSort(sortedList100,"bubbleSort2");
        SortProcess.performSort(sortedList100,"shellSort");
        System.out.println("*****************************************************************************\n\n");

        // sort sorted list of 1000 items
        Integer[] sortedList1000 = SortProcess.sortedList(1000);
        SortProcess.performSort(sortedList1000,"bubbleSort");
        SortProcess.performSort(sortedList1000,"bubbleSort2");
        SortProcess.performSort(sortedList1000,"shellSort");
        System.out.println("*****************************************************************************\n\n");
    }
}
