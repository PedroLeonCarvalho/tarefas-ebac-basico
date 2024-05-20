package org.example.principal;

public class Stack {
    private Node top;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    // Método para empilhar um elemento no topo
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Método para desempilhar o elemento do topo
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack está vazia");
        }
        int data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Método para espiar o elemento do topo sem removê-lo
    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return top == null;
    }

    // Método para obter o tamanho da pilha
    public int size() {
        return size;
    }


}
