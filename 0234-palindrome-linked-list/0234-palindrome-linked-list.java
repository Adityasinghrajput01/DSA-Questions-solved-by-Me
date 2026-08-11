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

    public void rev(ListNode temp,StringBuilder t){
        if(temp==null) return;
         rev(temp.next,t);
       t.append(temp.val);
    }
    public void simp(ListNode temp,StringBuilder t){
               if(temp==null) return;
        t.append(temp.val);
             simp(temp.next,t);
    }
    public boolean isPalindrome(ListNode head) {
          StringBuilder rev = new StringBuilder();
        StringBuilder simple = new StringBuilder();
        rev(head, rev);
        simp(head, simple);
        return rev.toString().equals(simple.toString());
    }
}