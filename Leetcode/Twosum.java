import java.util.Scanner;
class Twosum
{
	public static void main(String args[])
	{
	Scanner sc= new Scanner(System.in);
		System.out.print("Enter the key element: ");
		int key=sc.nextInt();
		
		int arr[]={2,7,11,15};
		for(int i=0 ; i<arr.length ; i++)
		{
			for(int j=i+1 ; j<arr.length ; j++)
			{
				if( arr[i] + arr[j] == key )
				{
					System.out.print("Elements at " + i + " index and " + j + " index gives "+key);
					break;
				}
			}
		}
	}
}