class LLStack {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // print top of stack
    public static void top(LLStack list) {
        Node temp = list.head;
        if (temp != null) {
            System.out.println("Top of stack: " + temp.data);
        } else {
            System.out.println("Empty Stack");
        }
    }

    public static boolean isempty(LLStack list) {
        Node temp = list.head;
        if (temp == null) {
            return true;
        } else {
            return false;
        }
    }

    // pop top stack element
    public static void pop(LLStack list) {
        Node temp = list.head;
        if (temp == null) {
            System.out.println("Stack underflow");
        } else {
            list.head = temp.next;
        }
    }

    // push element on top of stack
    public static void push(int data, LLStack list) {
        Node newNode = new Node(data);

        // push elements at the top in stacks
        if (list.head == null) {
            list.head = newNode;
        } else {
            Node temp = list.head;
            newNode.next = temp;
            list.head = newNode;
        }
    }

    // print stack elements
    public static void printList(LLStack list) {
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LLStack list = new LLStack();
        list.push(25, list);
        list.push(95, list);
        list.push(26, list);
        list.push(35, list);
        list.pop(list);
        printList(list);
        list.top(list);
        System.out.println(list.isempty(list));

    }
}