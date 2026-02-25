import java.util.*;
public class Largest
{
	public static int show(int arr[])
	{
		int largest = Integer.MIN_VALUE; //initialise the largest variable with -infinity
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		return largest;
	}	

	public static void main(String args[])
	{
		int arr[]={1,2,6,3,5};
		System.out.println("largest value is "+show(arr));
	}

}