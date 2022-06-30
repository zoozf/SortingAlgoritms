/***
 * MergeSort Algorithm is implemented thanks to uni lecture materials
 * and the following tutorial:
 * https://www.codexpedia.com/java/java-merge-sort-implementation/
 */

import java.util.ArrayList;

public class MergeSort implements SortingAlgorithm{

    long start,end;
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        start = System.nanoTime();

        /**
         * Find the middle of the array and split its contents
         * into two different arrays
         * @param left
         * @param right
         * */
        int middleIndex = (int) (double)input.size()/2;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        if (input.size() == 1){
            end = System.nanoTime();
            return input;
        } else {
            for (int i = 0; i < middleIndex; i++){
                left.add(input.get(i));
            }
            for (int i = middleIndex ; i < input.size(); i++){
                right.add(input.get(i));
            }

            /** Recursively sort both partitions & merge the result together **/
            left = sort(left);
            right = sort(right);

            return merge(left,right,input);
        }
    }

    @Override
    public long executionTime() {
        return end-start;
    }

    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right, ArrayList<Integer> input){
        int leftIndex = 0;
        int rightIndex = 0;
        int inputIndex = 0;
        int restIndex;

        ArrayList<Integer> rest;

        /** Select the smallest of Integers in either
         * partition of the sorted input to add to
         * @param input
         */

        while (leftIndex < left.size() && rightIndex < right.size()){
            if ( (left.get(leftIndex).compareTo(right.get(rightIndex)) < 0)){
                input.set(inputIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                input.set(inputIndex, right.get(rightIndex));
                rightIndex++;
            }
            inputIndex++;
        }

        /** Select the rest of elements (if any) to add to
         * @param input
         */

        if(leftIndex >= left.size()){
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }

        for (int i = restIndex; i<rest.size(); i++){
            input.set(inputIndex, rest.get(i));
            inputIndex++;
        }
        return input;
    }

    @Override
    public String getAlgorithmName() {
        return "Merge Sort";
    }

}
