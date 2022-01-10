package LinkedListLearn;

import java.util.ArrayList;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode listNode = head;
        ArrayList<ListNode> arrayList = new ArrayList<>();

        if (listNode == null) {
            return false;
        }

        while (listNode.next != null) {
            if (arrayList.indexOf(listNode) != -1) return true;
            arrayList.add(listNode);
            listNode = listNode.next;
        }

        return false;
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
