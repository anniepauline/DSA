class Stack {

    final int MAX_SIZE = 10;
    int[] array = new int[MAX_SIZE];
    int top = -1; // empty stack

    public static void push(int x, Stack s) {
        if (s.top == s.MAX_SIZE - 1) {
            System.out.println("Stack overflow");
        }
        s.top++;
        s.array[s.top] = x;
    }

    public static void pop(Stack s) {
        if (s.top == -1) {
            System.out.println("Empty stack");
        }
        int data = s.array[s.top];
        s.top--;
        System.out.println("Popped: " + data);
    }

    public static void size(Stack s) {
        int size = s.top + 1;
        System.out.println("Stack size: " + size);
    }

    public static void top(Stack s) {
        System.out.println("Top of stack:" + s.array[s.top]);
    }

    public static void print(Stack s) {
        for (int i = 0; i <= s.top; i++) {
            System.out.println(s.array[i]);
        }
    }
}

class StacksUsingArray {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2, s);
        s.push(3, s);
        s.push(4, s);
        s.push(5, s);
        s.print(s);
        s.pop(s);
        s.pop(s);
        s.print(s);
        s.size(s);
        s.top(s);
    }
}
