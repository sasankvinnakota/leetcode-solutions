class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p1 = head;
        while(p1 !=null && p1.next!=null){
            if(p1.val == p1.next.val){
                p1.next = p1.next.next;
            }else{
                p1 = p1.next;
            }
        }return head;
    }
}