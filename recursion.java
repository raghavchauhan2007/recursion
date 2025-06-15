import java.util.*;
public class recursion {
    
    public static int calcPower(int x, int n){
        if(x == 0 && n == 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        
        return x*calcPower(x, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calcPower(x, n));
    }
}