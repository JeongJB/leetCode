package LinkedListLearn;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return l1;
    }

    public class ListNode {
        int val;
        MergeTwoLists.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, MergeTwoLists.ListNode next) { this.val = val; this.next = next; }
    }
}
