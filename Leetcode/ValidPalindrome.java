public class ValidPalindrome
{
    public boolean isPalindrome(String s){
        int i=0, j=s.length()-1;
        
        while(i<j){
            //skip invalid repeated char from left and right
             while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            
            //compare both the pointers
            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
            //else return false
            else{
                return false;
            }
        }
        //or return true 
        return true;
    }

    public static void main(String args[]){
        String s="A man, a plan, a canal: Panama";
        //using obj to call non static method
        ValidPalindrome vp = new ValidPalindrome();

        boolean ans = vp.isPalindrome(s);

        System.out.println(ans);
    }
}
    