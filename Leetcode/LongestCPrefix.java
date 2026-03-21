import java.util.Arrays;

public class LongestCPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Sort the array
        Arrays.sort(strs);

        // Compare the first and last strings
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < first.length && i < last.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }

        return result.toString();
    }

    // Main method
    public static void main(String[] args) {
        LongestCPrefix obj = new LongestCPrefix();

        String[] input = {"flower", "flow", "flight"};

        String prefix = obj.longestCommonPrefix(input);

        System.out.println("Longest Common Prefix: " + prefix);
    }
}