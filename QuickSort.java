
/**
 * QuickSort Algorithm implementation is based on
 * https://www.geeksforgeeks.org/java-program-for-quicksort/
 */

import java.util.ArrayList;

public class QuickSort implements SortingAlgorithm{

    private long start,end;
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        start = System.nanoTime();

        /**
         * check if input array is empty
         * */
        if(input.isEmpty()){
            end = System.nanoTime();
            return input;
        }

        /**
         * initialize two ArrayLists to hold the values
         * of each partition with
         * @param pivot being the last element in the list
         * */
        ArrayList<Integer> low = new ArrayList<>();
        ArrayList<Integer> high = new ArrayList<>();

        int pivot = input.get((input.size()-1));

        /**
         * sort input elements into two partitions depending on
         * @param pivot
         * */
        for (int i = 0; i < input.size(); i++){
            if(input.get(i) <= pivot){
                if(i == input.indexOf(pivot)){
                    continue;
                }
                low.add(input.get(i));
            } else {
                high.add(input.get(i));
            }
        }

        end = System.nanoTime();
        return merge(sort(low), pivot, sort(high));
    }

    /**
     * helper method to merge
     * @param low
     * @param pivot
     * @param high
     * */
    public ArrayList<Integer> merge(ArrayList<Integer> low, int pivot, ArrayList<Integer> high){
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(low);
        result.add(pivot);
        result.addAll(high);
        return result;
    }

    @Override
    public long executionTime() {
        return end-start;
    }
}
