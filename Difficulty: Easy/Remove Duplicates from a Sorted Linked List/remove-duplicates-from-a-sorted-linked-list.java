/* Structure of linked list Node
class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
}
*/
class Solution {
    Node removeDuplicates(Node head) {
        if(head.next == null)
        return head;
        Node slow = head;
        Node fast = head.next;
        while(fast != null)
        {
            if(fast.data == slow.data)
            {
                fast = fast.next;
            }
            else
            {
                slow = slow.next;
                slow.data = fast.data;
                fast = fast.next;
            }
        }
        slow.next = null;
        return head;
    }
}