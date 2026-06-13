class Solution {
    boolean isPalindrome(String s) {
        int j = 0;
        boolean flag = true;
        for(int i = s.length()-1; i>-1; i--)
        {
            if(s.charAt(i) != s.charAt(j))
            flag = false;
            j++;
        }
        if(flag == false)
        return false;
        else
        return true;
    }
}