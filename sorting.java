
//primitive sorting(No customization) -- used in DSA
//object sorting(customization possible) -- used in real life logic
import java.util.*;
public class sorting
{
	public static void main(String[] args) {
	    int[] arr1={1,4,5,3,2,}; //primitive arr
		
		System.out.print("original array: ");
		for(int i=0; i<arr1.length; i++){
		    System.out.print(arr1[i]+" ");    
		}
		System.out.println();
		//twin pointer quick-sort algo
		//quick-sorrt algo is not stable 
		//Merge-sort + Insertion-sort --> Timsort algo (stable)
		Arrays.sort(arr1); 
		
		System.out.print("Sorted array ascending: ");
		for(int i=0; i<arr1.length; i++){
		    System.out.print(arr1[i]+" ");    
		}
		System.out.println();
		
		//    -- Object sorting(Descending order)--
		Integer[] arr2={1,4,5,3,2,}; //object array
		Arrays.sort(arr2, Collections.reverseOrder());
		
		System.out.print("Sorted array descending: ");
		for(int i=0; i<arr2.length; i++){
		    System.out.print(arr2[i]+" ");    
		}
	}
}

//    -- Object sorting(Descending order)--

/*Integer[] arr = {5,2,9,1};
Arrays.sort(arr, Collections.reverseOrder());
*/