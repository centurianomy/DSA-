class Problem28
{
    public int strStr(String haystack, String needle) 
    {
        for(int i=0 ; i<haystack.length()-needle.length()+1 ; i++)
        {
            if(haystack.charAt(i)==needle.charAt(0)) //comparing char of haystack with the first element of the needle string.
            {
                if(haystack.substring(i,needle.length()+i).equals(needle))  //comapare the char of haystack with char of needle.(Syntax: s1.substring(i,j))
                {
                    return i;
                } 
            }
        }
         return -1; 
    }
}

/*
	simpler use of substring code:

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;  // not matching, stop inner loop
                }
            }
            if (j == m) {  // all characters matched
                return i;
            }
        }
        return -1;  // not found
    }
}
*/