package LinkedListLearn;

public class MyLinkedList {
    private LinkedListNode head;

    public MyLinkedList() {
        this.head = null;
    }

    public int get(int index) {
        LinkedListNode linkedListNode = head;
        if (index >= getLength()) {
            return -1;
        }

        for (int i = 0; i < index; i++) {
            linkedListNode = linkedListNode.next;
        }
        return linkedListNode.val;
    }

    public void addAtHead(int val) {
        LinkedListNode temp = new LinkedListNode(val);
        if (head == null) {
            head = temp;
        }
        else {
            temp.next = head;
            head = temp;
        }
    }

    public void addAtTail(int val) {
        LinkedListNode temp = new LinkedListNode(val);
        if (head == null) {
            head = temp;
        }
        else {
            LinkedListNode linkedListNode = head;
            while (linkedListNode.next != null) {
                linkedListNode = linkedListNode.next;
            }
            linkedListNode.next = temp;
        }
    }

    public void addAtIndex(int index, int val) {
        LinkedListNode temp = new LinkedListNode(val);
        LinkedListNode linkedListNode = head;
        if (index >= getLength() + 1) {
            return;
        }

        if (index == 0) {
            if (head != null) {
                temp.next = head;
            }
            head = temp;
        }
        else {
            for (int i = 0; i < index - 1; i++) {
                linkedListNode = linkedListNode.next;
            }
            temp.next = linkedListNode.next;
            linkedListNode.next = temp;
        }

    }

    public void deleteAtIndex(int index) {
        LinkedListNode linkedListNode = head;
        if (index >= getLength()) {
            return;
        }

        if (index == 0) {
            head = linkedListNode.next;
        }
        else {
            for (int i = 0; i < index - 1; i++) {
                linkedListNode = linkedListNode.next;
            }
            linkedListNode.next = linkedListNode.next.next;
        }
    }

    private int getLength() {
        int len;
        if (head == null) {
            len = 0;
        }
        else {
            LinkedListNode temp = head;
            len = 1;

            while (temp.next != null) {
                temp = temp.next;
                len++;
            }
        }
        return len;
    }

    private class LinkedListNode {
        public int val;
        public LinkedListNode next;

        public LinkedListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
