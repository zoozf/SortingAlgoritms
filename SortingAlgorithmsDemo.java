import java.util.ArrayList;

public class SortingAlgorithmsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>();
        Context context = new Context(new MergeSort());
        input.add(8);
        input.add(1);
        input.add(23);
        input.add(7);
        input.add(55);
        input.add(-1);
        input.add(88);
        context.executeStrategy(input);
    }
}
