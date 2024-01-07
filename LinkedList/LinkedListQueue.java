public class LinkedListQueue {
    Node front;
    Node rear;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next =null;
        }
    }

    // add element to queue at the rear
    public static void enqueue(int data, LinkedListQueue list) {
        Node newNode = new Node(data);

        if (list.front == null) {
            list.front = newNode;
            list.rear = newNode;
        } else {
            Node temp = list.rear;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            list.rear = temp.next;
        }
    }

    // remove element from queue at the front
    public static void dequeue(LinkedListQueue list) {
        Node temp = list.front;
        list.front = temp.next;
    }

    // if no element at queue front, Q is empty
    public static boolean isempty(LinkedListQueue list) {
        if (list.front == null) {
            return true;
        } else
            return false;
    }

    public static void printQueue(LinkedListQueue list) {
        Node temp = list.front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListQueue list = new LinkedListQueue();
        list.enqueue(20, list);
        list.enqueue(21, list);
        list.enqueue(22, list);
        list.enqueue(24, list);
        list.dequeue(list);
        list.dequeue(list);
        list.enqueue(26, list);
        list.dequeue(list);
        list.dequeue(list);

        list.printQueue(list);
        if (list.isempty(list)) {
            System.out.println("Empty list");
        }
    }
}
