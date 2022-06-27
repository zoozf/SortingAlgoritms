import java.util.ArrayList;

public class Context {
    private SortingAlgorithm sortingAlgorithm;

    public Context(SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public void executeStrategy(ArrayList<Integer> input){
        System.out.println("Sorted list is: " + sortingAlgorithm.sort(input));
        System.out.println("List sorted in: " + sortingAlgorithm.executionTime() + " ns");
    }
}
