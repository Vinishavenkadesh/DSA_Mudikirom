import java.util.Arrays;

public class I_VarCharOverloading {
    public static void main(String[] args) {
        varchar(2,3,4,5,6);
        varchar("Isha","Vinisha","Vinisha Venkadesh");
    }

    static void varchar(String ...v){
          System.out.println(Arrays.toString(v));
    }
    static void varchar(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
