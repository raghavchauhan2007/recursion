import java.util.*;
public class recursion {

public static boolean isSorted(int arr[], int idx){
    if(idx == arr.length-1){
        return true; 
    }
    if(arr[idx]>arr[idx+1]){
        return false;
    }
    else{
        return isSorted(arr, idx+1);
    }
}

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int [] r={1,2,3,4,5};
        System.out.println(isSorted(r, 0));
    }
}