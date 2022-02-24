import java.util.Stack;

public class RestrictedDataStructure {
    public static void main(String[] args)
    {

        Stack<Character> newStack = new Stack<>();

        newStack.push('A');
        newStack.push('B');
        newStack.push('C');
        newStack.push('D');
        newStack.push('E');
        newStack.push('F');
        newStack.push('G');

        System.out.println("Initial Stack: " + newStack);
        System.out.println("Popped element: " + newStack.pop());
        System.out.println("Is Stack empty? " +  newStack.isEmpty());
        System.out.println("Size of Stack : " + newStack.size());
        System.out.println("Popped element: " + newStack.pop());
        System.out.println("Current Stack " + newStack);
    }
}