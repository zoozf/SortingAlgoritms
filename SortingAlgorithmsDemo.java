import java.util.ArrayList;

public class SortingAlgorithmsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(8);
        input.add(1);
        input.add(23);
        input.add(7);
        input.add(55);
        input.add(-1);
        input.add(88);

        Context bubbleContext = new Context(new BubbleSort());
        bubbleContext.executeStrategy(input);

        Context selectionContext = new Context(new SelectionSort());
        selectionContext.executeStrategy(input);

        Context insertionContext = new Context(new InsertionSort());
        insertionContext.executeStrategy(input);

        Context mergeContext = new Context(new MergeSort());
        mergeContext.executeStrategy(input);

        Context quickContext = new Context(new QuickSort());
        quickContext.executeStrategy(input);



    }
}
