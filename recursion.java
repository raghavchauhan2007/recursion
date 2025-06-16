import java.util.*;
public class recursion {

public static void sortX(String str, int idx, int count, String newString){
    if(idx == str.length()){
        for(int i=0; i<count; i++){
            newString+='x';
        }
        System.out.println(newString);
        return;
    }
    
    if(str.charAt(idx) == 'x'){
        count++;
        sortX(str, idx+1, count, newString);
    }
    else{
        newString+=str.charAt(idx);
        sortX(str, idx+1, count, newString);
    }
}

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        sortX("acxcbfhgxfxxfcgfxxfxfzdxf", 0, 0, "");
    }
}