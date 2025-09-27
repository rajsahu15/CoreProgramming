import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 20, 3, 10 };
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[], int start, int end) {
        if (start > end)
            return;
        int i = start;
        int j = end;
        if (i < j) {
            int pivot = (start + end) / 2;
            while (arr[i] < arr[pivot]) {
                i++;
            }
            while (arr[j] > arr[pivot]) {
                j--;
            }
        }
        if (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
        sort(arr, start, j);
        sort(arr, i, end);

    }

}
