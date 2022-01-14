package LinkedListLearn;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = new ListNode();
        ListNode temp = head;
        int idx = 0;

        while (l1 != null && l2 != null) {
            temp.next = new ListNode(0);
            temp = temp.next;

            int num = l1.val + l2.val + idx;
            if (num >= 10) {
                idx = 1;
                num -= 10;
            }
            else {
                idx = 0;
            }

            temp.val += num;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null && l2 == null && idx == 1) {
            temp.next = new ListNode(idx);
            return head.next;
        }

        temp.next = (l1 == null) ? l2 : l1;
        if (temp.next == null) {
            if (idx == 1) temp.next = new ListNode(idx);
        }
        else {
            temp = temp.next;

            while (temp.next != null && temp != null) {
                int num = temp.val + idx;
                if (num >= 10) {
                    idx = 1;
                    num -= 10;
                }
                else {
                    idx = 0;
                }
                temp.val = num;
                temp = temp.next;
            }

            if (temp != null) {
                int num = temp.val + idx;
                if (num >= 10) {
                    idx = 1;
                    num -= 10;
                }
                else {
                    idx = 0;
                }
                temp.val = num;
                if (idx == 1) temp.next = new ListNode(idx);
            }
        }

        return head.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
