public class Pairing
{
	public static void run( int arr[] )
	{
		int key;		
		for(int i=0; i<arr.length; i++)
		{
			key=arr[i];
			for(int j=i+1; j<arr.length; j++)
			{
				System.out.print("(" + key + "," + arr[j] + ")");
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