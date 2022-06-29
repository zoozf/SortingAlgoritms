import java.util.ArrayList;

public class SelectionSort implements SortingAlgorithm {

    private long start,end;
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        start = System.nanoTime();



        end = System.nanoTime();
        return null;
    }

    @Override
    public long executionTime() {
        return end-start;
    }
}
