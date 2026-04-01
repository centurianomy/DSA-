// Given an array of integers and a number k, find the maximum sum of a subarray of size k.
//for k=constant:
// time complexity is O(n*k) i.e O(n).
//  and space complexity is O(1)
//effective for small values of k and large values of n
import java.util.*;

public class Maxsumsubarray
{
	public static void main(String[] args) {
	    int arr[]={2,1,7,5,4,3};
	    int i, j, k=3;
	    int max_sum= Integer.MIN_VALUE;
	    
	    for(i=0; i <(arr.length-k)+1; i++){
	        int curr_sum=0;
	        for(j=i; j<k+i; j++){
	            curr_sum=curr_sum+arr[j];
	        }
	        if(curr_sum>max_sum){
	            max_sum=curr_sum;
	        }
	    }
		System.out.println("Max substring sum is: "+max_sum);
	}
}