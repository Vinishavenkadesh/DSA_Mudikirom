import java.util.*;
public class Q_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        for(int i = 0;i<5;i++){
            list.add(sc.nextInt());
        } 
        System.out.println(list);
        list.set(1,5); //replacing
        System.out.println(list);
        list.add(1,3); //inserting
        System.out.println(list);
        System.out.println(list.contains(3));
    }
}
