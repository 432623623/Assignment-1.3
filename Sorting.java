import java.util.Comparator;

/**
 * Includes shellSort, bubbleSort, and bubbleSort2 methods
 * @author Patrick Song T00614298
 */
public class Sorting
{
    /**
     * Sorts array of integers using shell sort.
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>>
    void shellSort(T[] data){
        int comparisons=0, swaps=0, gap = data.length/2;
        while(gap>0){
            boolean swapflag=true;
            while(swapflag!=false){
                swapflag=false;
                for(int s=0; s<data.length-gap; s++){
                    comparisons+=1;
                    if(data[s].compareTo(data[s+gap])>0){
                        swap(data, s, s+gap);
                        swaps+=1;
                        swapflag=true;
                    }
                }
            }
            gap=gap/2;
        }
        System.out.println("comparisons: " + comparisons + " , swaps: "
                + swaps + " , total comparisons: " + (comparisons+swaps));    }

    /**
     * Swaps two elements in an array.
     * @param data   the array in which the elements are swapped
     * @param index1 the index of the first element to be swapped
     * @param index2 the index of the second element to be swapped
     */
    private static <T extends Comparable<T>>
    void swap(T[] data, int index1, int index2)
    {
        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    /**
     * Sorts array of objects using bubble sort.
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>>
    void bubbleSort(T[] data)
    {
        int comparisons=0, swaps=0, position, scan;

        for (position =  data.length - 1; position >= 0; position--)
        {
            for (scan = 0; scan <= position - 1; scan++)
            {
                comparisons+=1;
                if (data[scan].compareTo(data[scan + 1]) > 0){
                    swap(data, scan, scan + 1);
                    swaps+=1;
                }
                /**
                 for(T i: data){
                 System.out.print(i + " ");
                 }
                 System.out.println();
                 */
            }
        }
        System.out.println("comparisons: " + comparisons + " , swaps: "
                + swaps + " , total comparisons: " + (comparisons+swaps));
    }

    /**
     * Sorts array of objects using bubbleSort2.
     * Stops when list is sorted. Number of comparisons
     * is tallied.
     * @param data the array to be sorted
     */
    public static <T extends Comparable<T>>
    void bubbleSort2 (T[] data)
    {
        int comparisons=0, swaps=0, position, scan;
        boolean swapflag = true;
        position = data.length-1;
        while (swapflag!=false && position>=0){
            swapflag=false;
            for (scan = 0; scan <= position - 1; scan++)
            {
                comparisons+=1;
                if (data[scan].compareTo(data[scan + 1]) > 0){
                    swap(data, scan, scan + 1);
                    swaps+=1;
                    swapflag=true;
                }
                /**
                 System.out.println();
                 for(T i: data){
                 System.out.print(i + " ");
                 }
                 System.out.println();
                 System.out.print("position:" + position + ", scan:" + scan);
                 System.out.println();
                 */
            }
            position--;
        }
        System.out.println("comparisons: " + comparisons + " , swaps: "
                + swaps + " , total comparisons: " + (comparisons+swaps));
    }
}

