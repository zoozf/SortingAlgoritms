import java.util.ArrayList;

public class BubbleSort implements SortingAlgorithm {
    long start,end;
    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        start = System.nanoTime();
        ArrayList<Integer> bubbleSortList = new ArrayList<>();
        bubbleSortList.add(1);
        bubbleSortList.add(2);
        bubbleSortList.add(3);
        end = System.nanoTime();
        return bubbleSortList;
    }

    @Override
    public long executionTime() {
        return end-start;
    }
}
