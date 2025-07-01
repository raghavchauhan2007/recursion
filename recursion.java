public class recursion {
    
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(int idx, String str, String combination){

        if(idx==str.length()){
            System.out.println(combination);
            return;
        }

        char currchar = str.charAt(idx);
        String mapping = keypad [currchar - '0'];
        for(int i=0; i<mapping.length(); i++){
            printComb(idx+1, str, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {

        printComb(0, "56821254", "");
    }
}