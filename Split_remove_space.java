// Splitting string by Removing spaces
import java.util.Scanner;
public class Split_remove_space
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int i;    
        System.out.println("Enter string: ");
	    String str=sc.nextLine();
	    int n=str.length();
	    
		for(i=0; i<n; i++){
	        //if the char != ' '(blankspace)--> remember use double quotes" " for string and ' ' for char. 
	        if(str.charAt(i)!=' '){ 	            
	            System.out.print(str.charAt(i));  //"S.o.print" used here not "S.o.println"
	        }
	        else{
	            System.out.println();       
	        }
	    }
	}
}
