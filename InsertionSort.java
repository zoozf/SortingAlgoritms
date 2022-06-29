/**
 * InsertionSort Algorithm is implemented based on
 * university lecture materials.
 */

import java.util.ArrayList;

public class InsertionSort implements SortingAlgorithm{

    private long start,end;
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        int n = input.size();
        start = System.nanoTime();

        /**
         * For each element in the list:
         *      start with the second element in the input list
         *      compare it to the element indexing before current
         *      move each element to the right
         *      of current if bigger than current
         * */

        for (int i =1; i<n; i++){
            int curr = input.get(i);
            int j = i-1;
            while((j > -1) && (input.get(j).compareTo(curr) == 1)) {
                 input.set(j+1, input.get(j));
                 j--;
            }
            input.set(j+1, curr);
        }
        end=System.nanoTime();
        return input;
    }

    @Override
    public long executionTime() {
        return end-start;
    }
}
