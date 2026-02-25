public class Main
{
	public static void main(String[] args) {
	    int mid;
	    int f=0;
	    int l=3;
	    int key=3;
	    int flag=0;
	    int arr[]={1,3,5,6};
	    
	    while(f<=l)
	    {
	        mid=(f+l)/2;
	        if(key==arr[mid])
	        {
                System.out.println(mid);
                return;
	        }
	        else if(key < arr[mid])
            {
                l=mid-1;
            }
            else if(key > arr[mid])
            {
                f=mid+1;
                
            }
	    }
	    System.out.println(f);
	}
}