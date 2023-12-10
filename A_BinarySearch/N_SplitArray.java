package A_BinarySearch;

public class N_SplitArray {
    public static void main(String[] args) {
        int [] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }

    public static int splitArray(int[] arr, int k) {
        int start = 0; //max element in an array
        int end = 0; //sum of all element

        for(int i : arr){
            start = Math.max(start, i);
            end += i;
        }
        while(start < end){
            int mid = start+(end - start)/2;
            int pieces = 1;
            int sum = 0;

            for(int i : arr){
                sum += i;
                if(sum > mid){
                    sum = i;
                    pieces++;
                }
            }
            if(pieces <= k) //if pieces is less than or equal the given subarrar, then each array having larger number => so the sum of each array should be reduces
            end = mid;
            else
            start = mid + 1;
        }
        return start;
    }
}
