import java.util.*;

public class LinearSearch
{
	public static int show(int arr[], int key)
	{
		int flag=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				flag=1;
				return i;
			}
		}
		
		return -1;		
	}
	
	public static void main(String args[])
	{
		int arr[]={1,7,2,9,3,6,4,0,5};
		int key=10;
		System.out.println("Element found at index "+show(arr, key));
	}

}