import java.util.*;
public class recursion {
    
public static void stringRev(String str, int idx){
    if(idx == 0){
        System.out.print(str.charAt(idx));
        return;
    }    
    System.out.print(str.charAt(idx));
    stringRev(str, idx-1);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String r = "raghav";
        stringRev(r, r.length()-1);
    }
}