
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class TwoSum {

    public int[] twoSumOutput(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];     //10
            int find = target - num;    //60-10=50
            if (map.containsKey(find)) {
                return new int[] { map.get(find), i };
            }
            map.put(num, i);

        }
        
        return new int[] { -1, 1 };
    }
}

public class TestTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSum sol = new TwoSum();
        System.out.println(" Enter No of Elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the " + n + " Values: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Element: ");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(arr));
        System.out.println(target + "  sum is  at index: " + Arrays.toString(sol.twoSumOutput(arr, target)));
    }
}