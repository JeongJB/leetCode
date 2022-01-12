package LinkedListLearn;

import java.util.ArrayList;

public class ReverseLinkedList {
    public ListNode reverseListIteratively(ListNode head) {
        ListNode listNode = head;
        ArrayList<ListNode> arrayList = new ArrayList<>();
        int len = 0;

        arrayList.add(null);
        while (listNode != null) {
            arrayList.add(listNode);
            listNode = listNode.next;
            len++;
        }

        for (int i = len; i >= 1; i--) {
            arrayList.get(i).next = arrayList.get(i - 1);
        }

        if (len > 0) listNode = arrayList.get(len);
        else listNode = null;

        return listNode;
    }

    public ListNode reverseList(ListNode head) {
        ListNode listNode = head;
        if (listNode == null) return null;

        while (listNode.next != null) {
            listNode = listNode.next;
        }

        reverseListRecursively(head).next = null;
        return listNode;
    }

    public ListNode reverseListRecursively(ListNode listNode) {
        if (listNode.next == null) return listNode;
        reverseList(listNode.next).next = listNode;
        return listNode;
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode listNode = head;
        ListNode listSlow;
        ListNode listHead;
        int idx = 0;
        if (listNode == null) return null;

        while (listNode != null) {
            if (listNode.val == val) {
                listNode = listNode.next;
            }
            else break;
        }
        listHead = listNode;
        listSlow = listNode;

        while (listNode != null) {
            if (listNode.val == val) {
                listSlow.next = listNode.next;
            }
            if (idx == 0) idx = 1;
            else if (idx == 1 && listNode != null && listNode.val != val) {
                listSlow = listSlow.next;
            }
            listNode = listNode.next;
        }

        return listHead;
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode listNode = head;
        ArrayList<ListNode> arrayList = new ArrayList<>();
        if (listNode == null) return null;

        while (listNode != null) {
            arrayList.add(listNode);
            listNode = listNode.next;
        }

        int len = arrayList.size();
        for (int i = 0; i < len - 2; i += 2) {
            arrayList.get(i).next = arrayList.get(i + 2);
        }

        for (int i = 1; i < len - 3; i += 2) {
            arrayList.get(i).next = arrayList.get(i + 2);
        }

        if (len % 2 == 0) {
            arrayList.get(len - 2).next = arrayList.get(1);
            arrayList.get(len - 1).next = null;
        }
        else {
            if (len > 1) {
                arrayList.get(len - 1).next = arrayList.get(1);
                arrayList.get(len - 2).next = null;
            }
        }

        return arrayList.get(0);
    }

    public boolean isPalindrome(ListNode head) {
        ListNode listNode = head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode != null) {
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }

        int len = arrayList.size();
        int ptrL = (len % 2 == 0) ? len / 2 - 1 : len / 2;
        int ptrR = len / 2;

        for (;ptrL >= 0; ptrL--) {
            if (arrayList.get(ptrL) != arrayList.get(ptrR++)) return false;
        }

        return true;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
