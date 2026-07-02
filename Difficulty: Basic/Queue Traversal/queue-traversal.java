class Solution {
    public ArrayList<Integer> queueTraversal(Queue<Integer> q) {
        ArrayList<Integer> l1 = new ArrayList<>();
        while(q.size() != 0)
        {
            l1.add(q.remove());
        }
        return l1;
    }
}