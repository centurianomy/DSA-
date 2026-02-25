import java.util.*;
class Palindrome
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=sc.nextInt();
	int original=n;
	int rem;
	int reverse=0;
	
	while(n!=0)
	{
	rem=n%10;
	reverse=(reverse*10)+rem;
	n=n/10;
	}
		
	if(original==reverse)
	{
		System.out.println("Yes, Palindrome no");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
}
}