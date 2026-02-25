import java.util.*;
public class BinarySearch
{
	public static int show(int arr[], int key)
	{
		int start=0;
		int end=arr.length-1;
		int mid;
		while(start <= end)
		{
			mid = (start+end)/2;
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key>arr[mid])
			{	
				start=mid+1; 
			}
			
			else	
			{
				end=mid--; 
			}
		}		
		return -1;
	}

	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7};
		int key=7;
		System.out.println("Element found at index "+show(arr, key));
	}
}