//frequency count

import java.util.*;
public class Frequency
{
    public static void show(int[] arr){
                HashMap<Integer,Integer> map= new HashMap<>();  //<element, index> 
                int count=0;
                for(int i=0; i<arr.length; i++){
                    if( map.containsKey(arr[i]) ){ //checks if the number is already inside hashmap
                        map.put( arr[i] , 1+map.get(arr[i]) ); //increase its freq by 1
                    }
                    
                    else{
                        map.put(arr[i],1); //if element not in the hashmap include it
                    }
                    
                }
                System.out.println("Elements with frequencies: "+map);
    }

	public static void main(String[] args) {
		int[] arr={2,6,2,8,11,6,11,11};
		show(arr);
	}
}
