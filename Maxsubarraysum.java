public class Maxsubarraysum
{
	public static void show(int arr[])
	{
		int current=0;
		int max=Integer.MIN_VALUE;

		for(int k=0; k<arr.length; k++)
		{
			for(int i=k; i<arr.length; i++)
			{
				for(int j=k; j<i; j++)
				{
					//System.out.print(arr[j]);
					current=current+arr[j];
					if(current>max)
					{
						max=current;
					}
				}						
			}		
		}

		System.out.print("Max sum of subarray is "+max);
	}
		
	public static void main(String args[])
	{
		int arr[]={2,4,6,8,10};
		show(arr);
	}
	
}