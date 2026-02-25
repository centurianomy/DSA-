public class Subarray
{
	public static void run(int arr[])
	{
		for(int k=0; k<arr.length; k++)
		{
			for(int i=k; i<arr.length; i++)
			{
				for(int j=k; j<i; j++)
				{
					System.out.print(arr[j]);
				}
				System.out.print(" ");
			}
			System.out.println();
		
		}
	}
	
	public static void main(String args[])
	{
		int arr[]={2,4,6,8,10};
		run(arr);
	}
}