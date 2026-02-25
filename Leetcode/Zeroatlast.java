
import java.util.Scanner;
public class Zeroatlast{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int count=0;
        int i;
        System.out.println("Enter n: ");    
        int n=s.nextInt();
        
        int[] arr=new int[n];
        
        System.out.println("Enter array elements: ");    
        for(i=0; i<n; i++){
        arr[i]=s.nextInt();
        }
        
        for(i=0; i<n; i++){
            if(arr[i]!=0){ //check for non zero elements
                arr[count]=arr[i];
                count++;
            }
        }
        while(count<n){
            arr[count]=0;
            count++;
        }
        System.out.println("Result: "); 
        for(i=0; i<n; i++){
             System.out.print(arr[i]+" "); 
        }
    }
}
