import java.util.Scanner;
public class Inputarray
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter n: ");
	    int n=s.nextInt();
	    
	    System.out.println("enter array: ");
	    int[] arr=new int[n];
	    
	    for(int i=0; i<n; i++){
	    arr[i]=s.nextInt();
        
	    }
	    
		System.out.println("Hello World");
	}
}
