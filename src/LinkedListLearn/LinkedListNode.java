package LinkedListLearn;

public class LinkedListNode {
    public int val;
    public LinkedListNode next;

    public LinkedListNode() {
        this.val = 0;
        this.next = null;
    }

    public LinkedListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public LinkedListNode(int val, LinkedListNode next) {
        this.val = val;
        this.next = next;
    }
}
