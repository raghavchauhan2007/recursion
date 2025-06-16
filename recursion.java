import java.util.*;
public class recursion {

    public static boolean [] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString){
        
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar=str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicates(str, idx+1, newString);
        }
        else{
            newString+=currChar;
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newString);
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        removeDuplicates("abccda", 0, "");
    }
}