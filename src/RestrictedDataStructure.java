

public class RestrictedDataStructure {
    public static void main(String[] args)
    {
        Stack myStack =new Stack(4);

        myStack.push(3);
        myStack.push(67);
        myStack.push(6);
        myStack.push(9);


        System.out.println("Is Stack full? " +  myStack.isFull());
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Is Stack empty? " +  myStack.isEmpty());
        System.out.println("Is Stack full? " +  myStack.isFull());
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("The top element is "+myStack.readTop());
        System.out.println("Popped element: " + myStack.pop());
        System.out.println("Is Stack empty? " +  myStack.isEmpty());





    }
}
