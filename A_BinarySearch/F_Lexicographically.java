package A_BinarySearch;

public class F_Lexicographically {
    public static void main(String[] args) {
        // Input: letters = ["c","f","j"], target = "a"
        // Output: "c"

        char [] letters = {'c','f','j'};//0 1 2 3
        // char [] letters ={'x','x','y','y'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] arr, char target) {
       int start = 0;
       int end = arr.length - 1;
       while(start<=end){
        int mid = start+(end - start)/2;
        if(target < arr[mid])
        end = mid - 1;
        else
        start = mid + 1;
       }
    //    return arr[start%arr.length]; 
    //    4%4 == 0 => start == arr.length (same)
    //if start is at index 3 and end is at index 4, in 3%4 it return 3, same way start will be at index 3
    if(start == arr.length)
    return arr[0];
    else
    return arr[start];
    }
}
