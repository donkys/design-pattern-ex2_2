import java.util.Collections;
import java.util.List;

public class InsertionSort implements SortingAlgorithm{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Insertion sort is sorting the items...");
        Collections.sort(numbers);
    }
}
