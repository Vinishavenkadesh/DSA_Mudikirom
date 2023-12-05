package LinearSearch;
import java.util.*;

public class E_SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr ={{1,2,3,4},
                        {3,5,11,45,66},
                        {1,5},
                        {6,7,88,93}};
        System.out.print("Enter Target : ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(Index(arr, target)));
        System.out.println(maxIn2D(arr));
    }

    static int [] Index(int [][] arr,int target){
          for(int row=0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col] == target)
                return new int[]{row,col};
            }
          }
          return new int[]{-1,-1};
    }

    static int maxIn2D(int [][] arr){

        int max = arr[0][0];

        for(int [] i:arr){
            for(int j : i){
                if(j>max)
                max = j;
            }
        }
        System.out.println(Arrays.toString(Index(arr, max))); 
        return max;
    }
}
