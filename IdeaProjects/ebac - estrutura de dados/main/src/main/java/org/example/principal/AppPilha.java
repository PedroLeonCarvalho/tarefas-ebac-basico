package org.example.principal;

public class AppPilha {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element: " + stack.top()); // Output: 3
        System.out.println("Stack size: " + stack.size()); // Output: 3

        System.out.println("Popped element: " + stack.pop()); // Output: 3
        System.out.println("Top element after pop: " + stack.top()); // Output: 2
        System.out.println("Stack size after pop: " + stack.size()); // Output: 2

        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false

        // Empty the stack
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.pop());
        }

        System.out.println("Is stack empty after popping all elements? " + stack.isEmpty()); // Output: true
    }
}
