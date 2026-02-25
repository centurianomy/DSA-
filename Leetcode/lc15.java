public class Main
{
	public static void main(String[] args) {
	    int a[]={-1,0,1,2,-1,-4};
	    for(int i=0;i<6;i++)
	    {
	        for(int j=i+1;j<6;j++)
	        {
	            for(int k=j+1;k<6;k++)
	            {
	                if(a[i]+a[j]+a[k]==0)
	                {
	                    System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");              
	                }
	            }
	        }
	    }
	}
}
