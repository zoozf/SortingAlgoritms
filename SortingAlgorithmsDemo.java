import java.util.ArrayList;

public class SortingAlgorithmsDemo {
    public static void main(String[] args) {
        Context context = new Context(new BubbleSort());
        ArrayList<Integer> input = new ArrayList<>();
        input.add(8);
        input.add(1);
        input.add(23);
        context.executeStrategy(input);
    }
}
