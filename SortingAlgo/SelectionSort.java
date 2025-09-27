import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int arr[] = { 10, 2, 3, 4, 20 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int smallEle = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallEle]) {

                    smallEle = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallEle];
            arr[smallEle] = temp;
        }
    }
}
