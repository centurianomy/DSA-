import java.util.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int left=0;
        int flag=0;

        System.out.print("Enter the string: ");
        String str=sc.nextLine();
        int right=str.length()-1;
        
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                flag=1;
                break;
            }
            left++;
            right--;
        }
        if(flag==1){
            System.out.print("Not Palindrome.");
        }
        else{
            System.out.print("Palindrome.");
        }
    }
}