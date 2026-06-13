class Solution {
    public int maxConsecBits(int[] arr) {
        int maxcount = 0;
        int onecount = 0;
        int zerocount = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
            zerocount++;
            else
            zerocount = 0;
            if(arr[i] == 1)
            onecount++;
            else
            onecount = 0;
            if(maxcount < onecount || maxcount < zerocount)
            maxcount = Math.max(onecount,zerocount);
        }
        return maxcount;
        
    }
}
