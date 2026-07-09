/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null)
        return ;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int i = 0,j = list.size()-1;
        temp = head;
       int count = 1;
        while(temp!=null){
            if(count%2==0){
                 temp.val = list.get(j--);
            }
            else
            temp.val = list.get(i++);
            temp = temp.next;
            count++;
        }
    }
}