package org.example.principal;




public class Queue {
    private Node front;
    private Node rear;
    private int size;

    private class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }
    }

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // Método para adicionar um elemento ao final da fila
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return front == null;
    }

    // Método para remover o elemento da frente da fila
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int data = front.getData();
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    // Método para espiar o elemento do final da fila
    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return rear.getData();
    }
}


