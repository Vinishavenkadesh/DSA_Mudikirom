import java.util.*;
public class K_ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(ArmStrong(n));

        for(int i = 100;i<1000;i++){
            if(ArmStrong(i))
            System.out.print(i + " ");
        }
    }
    static boolean ArmStrong(int num){
        int original = num;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            sum  = sum + rem*rem*rem;
            num = num/10;
        }
        return sum==original;
    }
}
