package LinkedListLearn;

public class FlattenLinkedList {
    public Node flatten(Node head) {
        Node node = head;
        flattenRecursive(node);
        return head;
    }

    public Node flattenRecursive(Node node) {
        if (node == null) return null;

        while (node.next != null) {
            if (node.child != null) {
                Node temp = flattenRecursive(node.child);
                if (node.next == null && node.child == temp) {
                    node.child = null;
                    node.next = temp;
                    temp.prev = node;
                }
                else {
                    temp.next = node.next;
                    node.next.prev = temp;
                    node.next = node.child;
                    node.child.prev = node;
                    node.child = null;

                    node = temp.next;
                }
            }
            if (node.next != null) node = node.next;
        }

        if (node.child != null) {
            Node temp = flattenRecursive(node.child);
            if (node.next == null && node.child == temp) {
                node.child = null;
                node.next = temp;
                temp.prev = node;
            }
            else {
                temp.next = node.next;
                node.next.prev = temp;
                node.next = node.child;
                node.child.prev = node;
                node.child = null;

                node = temp.next;
            }
        }

        return node;
    }


    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };
}
