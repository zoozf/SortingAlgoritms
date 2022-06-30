/**
 * BubbleSort Algorithm is implemented thanks to the
 * following tutorial:
 * https://www.geeksforgeeks.org/bubble-sort/
 * */

import java.util.ArrayList;

public class BubbleSort implements SortingAlgorithm {
    long start,end;
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        start = System.nanoTime();

        int inputLength = input.size();

        /**
         * Check if the number adjacent to
         * @param current is lower, if so -> swap
         * */

        for (int i = 0; i< inputLength-1; i++){
            for (int j = 0; j < inputLength - i - 1; j++){
                if(input.get(j).compareTo(input.get(j+1)) > 0){
                    int current = input.get(j);
                    input.set(j, input.get(j+1));
                    input.set(j+1, current);
                }
            }
        }

        end = System.nanoTime();
        return input;
    }

    @Override
    public long executionTime() {
        return end-start;
    }

    @Override
    public String getAlgorithmName() {
        return "Bubble Sort";
    }
}
