package LinearSearch;

public class G_MaximumWealth {
    public static void main(String[] args) {
      int [][]  accounts = {{1,5},{7,3},{3,5}};
      System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][]arr){
        int max = 0;
        for(int [] row : arr){
            int amount = 0;
            for(int col : row){
              amount += col;
            }
            if(amount> max)
            max = amount;
        }
        return max;
    }
}
