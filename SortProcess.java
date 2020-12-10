import java.util.Random;

/**
 * Contains methods to sort a list,
 * return a random list, and return a sorted list
 * @author Patrick Song T00614298
 */

public class SortProcess {

    String sortType;
    int[] list;
    int size;

    // sorts list with bubbleSort, bubbleSort2, or shellSort.
    // records time elapsed. prints sorted list.
    public static void performSort(Integer[] list, String sortType) {
        // make a copy of unsorted list
        Integer[] listCopy = new Integer[list.length];
        System.arraycopy(list,0,listCopy,0,list.length);
        System.out.println(sortType);
        // choose sort method. start timer. sort list
        long start = 0, end=0;
        if(sortType.equals("bubbleSort")){
            start = System.nanoTime();
            Sorting.bubbleSort(listCopy);
            end = System.nanoTime();
        }
        else if(sortType.equals("bubbleSort2")){
            start = System.nanoTime();
            Sorting.bubbleSort2(listCopy);
            end = System.nanoTime();
        }
        else if(sortType.equals("shellSort")){
            start = System.nanoTime();
            Sorting.shellSort(listCopy);
            end = System.nanoTime();
        }
        // end timer. calculate and print duration
        //long end = System.nanoTime();
        long duration = (end - start);
        System.out.println("time to sort: " + duration + " nanoseconds");
        // print sorted list
        System.out.println("sorted list");
        for(Integer i: listCopy){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // creates, prints, and returns random list of given size
    public static Integer[] randList(int size){
        Random generator = new Random();
        Integer[] list = new Integer[size];
        for(int i=0; i<size; i++){
            list[i]=generator.nextInt(10);
        }
        System.out.println("random list of " + size + " items");
        for(Integer i: list){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        return list;
    }

    // creates, prints, and returns sorted list of given size
    public static Integer[] sortedList(int size){
        Integer[] list = new Integer[size];
        for(int i=0; i<size; i++){
            list[i]=i;
        }
        System.out.println("sorted list of " + size + " items");
        for(Integer i: list){
            System.out.print(i + " ");
        }
        System.out.println("\n");
        return list;
    }
}