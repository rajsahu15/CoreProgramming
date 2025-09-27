import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = { 10, 30, 20, 3, 10 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        if (arr.length == 1) {
            return;
        }
        int left[] = new int[arr.length / 2];
        int right[] = new int[arr.length - left.length];
        for (int i = 0; i < arr.length; i++) {
            if (i < left.length) {
                left[i] = arr[i];
            } else {
                right[arr.length - 1 - i] = arr[i];
            }
        }
        sort(left);
        sort(right);
        merge(left, right, arr);
    }

    public static void merge(int a[], int b[], int c[]) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        while (i < a.length) {
            c[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }

    }
}
