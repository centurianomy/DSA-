import java.util.*;

class Problem28 {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            // Step 1: check if the first character matches
            if (haystack.charAt(i) == needle.charAt(0)) {
                //compares the substring of haystack with needle--> syntx: string.substring(startIndex, endIndex) where endIndex is exclusive
                if (haystack.substring(i, needle.length() + i).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter haystack string: ");
        String haystack = sc.nextLine();

        System.out.print("Enter needle string: ");
        String needle = sc.nextLine();

        Problem28 obj = new Problem28();
        int index = obj.strStr(haystack, needle);

        System.out.println("Output index: " + index);

        sc.close();
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