import java.util.*;
public class recursion {
public static int calcfactorial(int n){
    if(n == 1 || n == 0){
        return 1;
    }
    int factorialnm1=calcfactorial(n-1);
    int factorial=n*factorialnm1;
    return factorial;
}
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calcfactorial(n));
    }
}