public class Stack {
    private int size;
    private int[] stackArray;
    private int top;

    public Stack(int arraySize) {
        this.size = arraySize;
        stackArray = new int[size];
        top = -1;
    }

    public void push(int element) {
        stackArray[++top] = element;
        System.out.println(element + " is added");
    }

    public int pop() {
        if (top == -1)
            System.out.println("Underflow");
        else
            top--;
        return stackArray[top+1];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public int readTop() {
        return stackArray[top];
    }
}
