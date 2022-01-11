package LinkedListLearn;

import java.util.ArrayList;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) return null;

        ListNode temp = head;
        while (temp != fast) {
            fast = fast.next;
            temp = temp.next;
        }

        return temp;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode listNodeA = headA;
        ListNode listNodeB = headB;
        int lenA = 0;
        int lenB = 0;

        if (headA == null || headB == null) {
            return null;
        }

        while (listNodeA.next != null) {
            listNodeA = listNodeA.next;
            lenA++;
        }

        while (listNodeB.next != null) {
            listNodeB = listNodeB.next;
            lenB++;
        }

        if (listNodeA != listNodeB) return null;

        ListNode listNodeL = (lenA > lenB) ? headA : headB;
        ListNode listNodeS = (lenA > lenB) ? headB : headA;

        int interval = (lenA > lenB) ? lenA - lenB : lenB - lenA;

        while (interval != 0) {
            interval--;
            listNodeL = listNodeL.next;
        }

        while (listNodeL != listNodeS) {
            listNodeL = listNodeL.next;
            listNodeS = listNodeS.next;
        }

        return listNodeL;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode = head;
        ListNode slowNode = head;
        int idx = 0;
        int len = 0;
        int cnt = 0;

        while (listNode != null) {
            listNode = listNode.next;
            len++;
        }

        listNode = head;
        while (cnt < len - n) {
            listNode = listNode.next;
            cnt++;
            if (idx == 0) {
                idx = 1;
            }
            else {
                slowNode = slowNode.next;
            }
        }

        System.out.println(listNode.val);
        System.out.println(slowNode.val);

        if (listNode == slowNode) {
            if (head.next != null) {
                head = head.next;
            }
            else {
                head = null;
            }
        }
        else {
            if (slowNode.next != null) {
                slowNode.next = slowNode.next.next;
            }
        }

        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
