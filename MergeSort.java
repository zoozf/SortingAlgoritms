import java.util.ArrayList;

public class MergeSort implements SortingAlgorithm{

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> input) {
        ArrayList<Integer> mergeSortList = new ArrayList<>();
        mergeSortList.add(4);
        mergeSortList.add(5);
        mergeSortList.add(6);
        return mergeSortList;
    }

    @Override
    public long executionTime() {
        return 0;
    }
}
