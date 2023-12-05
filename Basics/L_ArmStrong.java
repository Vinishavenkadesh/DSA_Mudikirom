public class L_ArmStrong {
    public static void main(String[] args) {
        for(int i = 100;i<1000;i++){
            int sum = 0;
            int original = i;
            while(i<0){
              int rem = i%10;
              sum = sum+rem^3;
              i=i/10;
            }
            if(sum == original){
                System.out.println(sum);
            }
        }
    }
}
