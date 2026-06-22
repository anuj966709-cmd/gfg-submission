class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        //int temp = 0;
        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(i < j)
                {
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
                
            }
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            list.add(new ArrayList<>());

            for (int j = 0; j < mat[i].length; j++) {
                list.get(i).add(mat[i][j]);
            }
        }
        return list;
    }
}