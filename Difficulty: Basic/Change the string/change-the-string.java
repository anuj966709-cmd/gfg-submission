// User function Template for Java

class Solution {
    String modify(String s) {
        int x = s.charAt(0);
        if(x > 64 && x < 91)
        return s.toUpperCase();
        else
        return s.toLowerCase();
    }
}