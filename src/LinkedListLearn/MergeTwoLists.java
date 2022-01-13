package LinkedListLearn;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode listNode;
        ListNode head;

        if (list1.val > list2.val) {
            listNode = list2;
            list2 = list2.next;
        }
        else {
            listNode = list1;
            list1 = list1.next;
        }
        head = listNode;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                listNode.next = list2;
                list2 = list2.next;
            }
            else {
                listNode.next = list1;
                list1 = list1.next;
            }
            listNode = listNode.next;
        }

        listNode.next = (list1 == null) ? list2 : list1;

        return head;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
