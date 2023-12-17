import java.util.Collections;
import java.util.List;

public class MergeSort implements SortingAlgorithm{
    @Override
    public void sort(List<Integer> numbers) {
        System.out.println("Merge sort is sorting the items...");
        Collections.sort(numbers);
    }
}
