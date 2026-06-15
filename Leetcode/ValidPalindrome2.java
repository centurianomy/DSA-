class ValidPalindrome2 {
    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {

                // Try skipping left character
                int l1 = i + 1;
                int r1 = j;

                while (l1 < r1 && s.charAt(l1) == s.charAt(r1)) {
                    l1++;
                    r1--;
                }

                // Try skipping right character
                int l2 = i;
                int r2 = j - 1;

                while (l2 < r2 && s.charAt(l2) == s.charAt(r2)) {
                    l2++;
                    r2--;
                }

                return l1 >= r1 || l2 >= r2;
            }
        }

        return true;
    }
}