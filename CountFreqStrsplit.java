import java.util.*;

public class CountFreqStrsplit{
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>(); 
        
        String str="apple banana apple mango banana apple";
        String word="";
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch==' '){
                System.out.println(word);

                if(map.containsKey(word)){
                    map.put(word,(1+map.get(word)));
                }
                else{
                    map.put(word,1);
                }
                word="";

            }
            else{
                word=word+ch;
            }
        }
        //last word
        System.out.println(word);
        
        if(map.containsKey(word)){
                    map.put(word,(1+map.get(word)));
                }
                else{
                    map.put(word,1);
                }

        //convert keys to arrays and count the max word freq
        String[] words=map.keySet().toArray(new String[0]); //string array

        int maxFreq=0;
        String maxWord="";

        //hashmap traversing
        for(int i=0; i<words.length; i++){
            if(map.get(words[i]) > maxFreq){
                maxFreq=map.get(words[i]);
                maxWord=words[i];
            }
        }
        System.out.println("word = "+ maxWord);
        System.out.println("frequency = "+ maxFreq);
    }
}