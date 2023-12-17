import java.util.Collections;
import java.util.List;

public class SelectionSort implements SortingAlgorithm{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Selection sort is sorting the items...");
        Collections.sort(numbers);
    }
}
