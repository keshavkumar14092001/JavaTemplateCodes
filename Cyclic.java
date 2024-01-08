import java.util.*;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int first, int second) {
        
    }
}
