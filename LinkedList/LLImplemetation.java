class LLImplement {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert node at the beginning of Linked List
    public static void insertBeg(int data, LLImplement list) {
        Node new_node = new Node(data);
        // if list is empty, head is new node
        if (list.head == null) {
            list.head = new_node;
        } else {
            new_node.next = list.head;
            list.head = new_node;
        }
    }

    // Insert node at the end of LinkedList
    public static void insertEnd(int data, LLImplement list) {
        Node new_node = new Node(data);
        Node temp = list.head;

        if (temp == null) {
            list.head = new_node;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new_node;
    }

    // Insert Node at any given position in the LinkedList
    public static void insertPos(int position, int data, LLImplement list) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = list.head;
            list.head = newNode;
            return;
        }
        // position other than 1
        Node temp = list.head;
        for (int i = 0; i < position - 2; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print all the nodes in the LinkedList
    public static void printList(LLImplement list) {
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // delete node at the beginningof LL
    public static void deleteBeg(LLImplement list) {
        Node temp = list.head;
        if (list.head == null) {
            System.out.println("No nodes to delete");
        } else {
            list.head = temp.next;
        }
    }

    // delete node at the end of LL
    public static void deleteEnd(LLImplement list) {
        Node temp = list.head;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }

    // delete node at given position
    public static void deletePos(LLImplement list, int position) {
        if (list.head == null) {
            System.out.println("Empty Linked List");
        }
        Node temp = list.head;
        if (position == 1) {
            list.head = temp.next;
            return;
        }

        for (int i = 0; i < position - 2; i++) {
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = temp1.next;
    }

    // delete key in LL
    public static void deleteKey(LLImplement list, int key) {
        // keep track of current and prev node
        Node temp = list.head;
        Node prev = null;

        // if key is present in head
        if (temp.data == key) {
            list.head = temp.next;
            return;
        }
        // search for key to be deleted
        while (temp.next != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        // if key not found, exit
        if (temp == null) {
            return;
        }
        // if key is found, unlink node from list
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        LLImplement list = new LLImplement();
        list.insertBeg(3, list);
        list.insertBeg(2, list);
        list.insertBeg(1, list);
        list.insertEnd(5, list);
        list.insertPos(4, 4, list);
        list.deleteBeg(list);
        list.deleteEnd(list);
        list.deletePos(list, 3);
        list.deleteKey(list, 3);
        printList(list);
    }
}
