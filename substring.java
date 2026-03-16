
public class substring
{
    public static void show(int arr[]){
        int n=arr.length;
        for(int k=n; k>0; k--){
            for(int i=n-k; i<n; i++){
                for(int j=n-k;j<=i; j++)
                {
                    System.out.println(arr[j]);
                }
                System.out.println();
            }
            //System.out.println();
        }
    }
	public static void main(String[] args) {
		int arr[]={2,4,6,8,10};
		show(arr);
	}
}
