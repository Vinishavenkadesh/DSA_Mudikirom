package A_BinarySearch;

public class L_RotatedSortedDuplicate {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        // output = true
        System.out.println(search(nums, target));
        // System.out.println(peak(nums));
    }

    static boolean search(int [] arr,int target){
         int peak = peak(arr);
         if(target == peak)
         return true;
         if(peak == -1){
          if(binarySearch(arr, target, 0, arr.length - 1) != -1)
          return true;
          else 
          return false;
         }
         if(target >= arr[0]){
            if(binarySearch(arr, target, 0,peak-1)!=-1)
            return true;
            else
            return false;
         }
         else
         if(binarySearch(arr, target, peak+1, arr.length-1)!=-1)
         return true;
         else
         return false;
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid - 1] > arr[mid])
                return mid - 1;
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                if (start < end && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            if((arr[start] < arr[mid])||(arr[mid] == arr[start])&&(arr[mid] > arr[end]))
            start = mid+1;
            else
            end = mid - 1;
        }
        return -1;
    }

    static int binarySearch(int [] arr,int target, int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target > arr[mid])
            start = mid + 1;
            else if(target < arr[mid])
            end = mid - 1;
            else
            return mid;
        }
        return -1;
    }

}
