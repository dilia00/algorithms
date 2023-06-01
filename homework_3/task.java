package homework_3;

public class task {
    private class Node {
        Node next;
        int value;
    }

    Node head;

    public void add(int value) {
        Node newNode = new Node();
        newNode.value = value;
        if (head != null)
            newNode.next = head;
        head = newNode;
    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node currentNode, Node previusNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previusNode;
    }
}
