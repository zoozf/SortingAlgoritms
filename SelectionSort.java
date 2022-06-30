/**
 * SelectionSort Algorithm is implemented thanks to the
 * following tutorial:
 * https://www.geeksforgeeks.org/selection-sort/
 * */

import java.util.ArrayList;

public class SelectionSort implements SortingAlgorithm {
    private long start,end;
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        start = System.nanoTime();


        int inputSize = input.size();

        /**
         * Go through the input size to find the lowest number
         * */
        for (int i = 0; i < inputSize - 1; i++){

            int current = i;

            /**
             * find the lowest number
             * */
            for (int j = i+1; j < inputSize; j++){
                if (input.get(j).compareTo(input.get(current)) < 0) {
                    current = j;
                }
            }

            /**
             * swap the lowest number with the first element
             * */
            int temp = input.get(current);
            input.set(current,input.get(i));
            input.set(i, temp);
        }

        end = System.nanoTime();
        return input;
    }

    @Override
    public long executionTime() {
        return end-start;
    }
}
