package BinarySearch;

import java.util.Arrays;

public class G_FirstLastPosition {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 8, 10 };
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };
        ans[0] = binarySearch(arr, target, true);
        ans[1] = binarySearch(arr, target, false);

        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean findingStart) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else {
                ans = mid;
                if (findingStart) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return ans;
    }

}