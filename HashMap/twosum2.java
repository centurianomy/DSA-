import java.util.*;
public class twosum2
{
    public static void show(int[] arr){
                HashMap<Integer,Integer> map= new HashMap<>();  //<element, index> 
                int target=14;
                int current_val;
                int req_num;
                for(int i=0; i<arr.length; i++){
                    current_val=arr[i];
                    
                    req_num = target - current_val;
                    
                    if(map.containsKey(req_num)){ //check whether the req elements is inside map or not
                        System.out.println("the indexes are: "+i+","+map.get(req_num)); //print index(req no) 
                        break;
                    }
                    
                    else{
                        map.put(current_val,i); //storing arr elements in hashmap
                        }
                }
    }

	public static void main(String[] args) {
		int[] arr={2,6,5,8,11};
		show(arr);
	}
}
