public class Reverse
{
	public static int[]/*void*/ show(int arr[]) //why use int[]
	{
		int first=0;
		int last=arr.length-1;
		int temp;
		while(first<last)		 
		{
			temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
			first++;
			last--;
		}
		return arr; //no need of return if void is used.
	}
	
	public static void main(String args[])
	{
		int arr[]={2,4,6,8,10};
		
		System.out.print("Initial array ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
			
		System.out.println();

		show(arr);

		System.out.print("Reversed array is ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}