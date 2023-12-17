import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    Ex2_2 - ใช้แนวคิดของ Open/Closed Principle เพือให้รองรับการทํางานกับ Sorting Algorithm ได้หลายวิธี เพิ่ม 3 Sorting Algorithms

    # 1.Selection sort is sorting the items... (ถ้า Algorithm คือ Selection Sort)
    # 2.Merge sort is sorting the items... (ถ้า Algorithm คือ Merge Sort)
    # 3.Insertion sort is sorting the items... (ถ้า Algorithm คือ Insertion Sort)

    จาก Ex2_1 แก้ไขใน sortNumbers() method
*/
public class Ex2 {

    public static final int MAX = 5;
    public static final int MIN_RANGE = 0;
    public static final int MAX_RANGE = 10;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        List<Integer> nums = inputNumbers();

        sortNumbers(nums, SortingType.SELECTION);
//        sortNumbers(nums, SortingType.MERGE);
//        sortNumbers(nums, SortingType.INSERTION);

        printNumbers(nums);
    }

    private static List<Integer> inputNumbers() {
        Scanner inp = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter 5 valid integers in the range [" + MIN_RANGE + ", " + MAX_RANGE + "]");
        while (nums.size() < MAX) {
            String s = inp.nextLine();
            if (isValidType(s) && isValidRange(Integer.parseInt(s))) {
                nums.add(Integer.parseInt(s));
            }
        }
        inp.close();
        return nums;
    }

    private static boolean isValidType(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            System.out.println("Invalid! Try again!");
            return false;
        }
    }

    private static boolean isValidRange(int num) {
        if (num < MIN_RANGE || num > MAX_RANGE) {
            System.out.println("Invalid range! Try again!");
            return false;
        }
        return true;
    }

    private static void sortNumbers(List<Integer> nums, SortingType type) {
        //SortingAlgorithm sortingStrategy = new SelectionSort();
        //SortingAlgorithm sortingStrategy = new MergeSort();
        //SortingAlgorithm sortingStrategy = new InsertionSort();

        //ไม่อยากให้ new SelectionSort().. แบบเปลือย ๆ เลยใช้ enum ทำให้สุดท้ายถ้าจะใช้ก็ต้องไปเพิ่ม new ... ใน enum ยากต่อการเพิ่ม Sorting Algorithm
        SortingAlgorithm sortingStrategy = type.getAlgorithm();

        sortingStrategy.sort(nums);
    }

    private static void printNumbers(List<Integer> nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }


}
