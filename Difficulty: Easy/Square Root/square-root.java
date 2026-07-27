class Solution {
    int floorSqrt(int n) {
        int i = 1;
        while(1<2)
        {
            if(i*i < n)
            i++;
            else if(i*i == n)
            return i;
            else
            return i-1;
        }
    }
}