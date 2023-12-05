import java.util.*;

public class P_2DArrayDynamic {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int[][] arr = new int[2][3];

    //     for (int row = 0; row < arr.length; row++)
    //         for (int col = 0; col < arr[row].length; col++) {
    //             arr[row][col] = sc.nextInt();
    //         }

    //     for (int row = 0; row < arr.length; row++) {
    //         for (int col = 0; col < arr[row].length; col++) {
    //             System.out.print(arr[row][col] + " ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
        
    //     for (int row = 0; row < arr.length; row++) {
    //         System.out.println(Arrays.toString(arr[row]));
    //     }
    //     System.out.println();
        
    //     for (int[] i : arr) {
    //         System.out.println(Arrays.toString(i));
    //     }
    // }
    public static void main(String[]args){
        int [][] arr = {{1,2,3,4},{2,3},{3,4,5}};

        for(int i =0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}