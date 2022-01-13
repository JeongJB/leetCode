package LinkedListLearn;

public class DoublyLinkedList {
    private LinkedListNode head;

    public DoublyLinkedList() {
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
            head.prev = temp;
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
            temp.prev = linkedListNode;
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
            addAtHead(val);
        }
        else {
            for (int i = 0; i < index; i++) {
                linkedListNode = linkedListNode.next;
            }

            if (linkedListNode == null) addAtTail(val);
            else {
                linkedListNode.prev.next = temp;
                temp.next = linkedListNode;
                temp.prev = linkedListNode.prev;
                linkedListNode.prev = temp;
            }
        }
    }

    public void deleteAtIndex(int index) {
        LinkedListNode linkedListNode = head;
        if (index >= getLength()) {
            return;
        }

        if (index == 0) {
            head = linkedListNode.next;
            if (head != null) head.prev = null;
        }
        else {
            for (int i = 0; i < index; i++) {
                linkedListNode = linkedListNode.next;
            }

            if (linkedListNode.prev != null) linkedListNode.prev.next = linkedListNode.next;
            if (linkedListNode.next != null) linkedListNode.next.prev = linkedListNode.prev;
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
        public LinkedListNode prev;

        public LinkedListNode(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }
}
