import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        String str1 = "abcda";
        String str2 = "cadba";
        
        // Step 0: Length check
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return;//it simply exits the loop and continues with the next statement after the loop. It does not exit the entire program like System.exit(0) would.
        }
        
        // Step 1: Count frequency of str1
        for(int i = 0; i < str1.length(); i++){
            char ch1 = str1.charAt(i);
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
        }
        
        // Step 2: Subtract frequency using str2
        for(int i = 0; i < str2.length(); i++){
            char ch2 = str2.charAt(i);
            
            if(!map.containsKey(ch2)){
                System.out.println("Not Anagram");
                return;//it simply exits the loop and continues with the next statement after the loop. It does not exit the entire program like System.exit(0) would.
            }
            
            map.put(ch2, map.get(ch2) - 1);
        }
        
        // Step 3: Final check
        for(int value : map.values()){
            if(value != 0){
                System.out.println("Not Anagram");
                return; //it simply exits the loop and continues with the next statement after the loop. It does not exit the entire program like System.exit(0) would.
            }
        }
        
        System.out.println("Anagram");
    }
}