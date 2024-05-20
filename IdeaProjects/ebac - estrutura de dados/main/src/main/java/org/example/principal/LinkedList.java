package org.example.principal;

public class LinkedList {
    private Node head;
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

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getNext() {
            return next;
        }
    }

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Adiciona um nó ao fim da lista
    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    // Remove o nó do fim da lista e retorna o mesmo
    public Node pop() {
        if (head == null) {
            throw new IllegalStateException("List is empty");
        }
        if (head.getNext() == null) {
            Node temp = head;
            head = null;
            size--;
            return temp;
        }
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        Node temp = current.getNext();
        current.setNext(null);
        size--;
        return temp;
    }

    // Insere um nó na posição especificada
    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            node.setNext(head);
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            node.setNext(current.getNext());
            current.setNext(node);
        }
        size++;
    }

    // Remove o nó na posição especificada
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    // Retorna o nó na posição especificada
    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    // Retorna o tamanho da lista
    public int size() {
        return size;
    }

    // Imprime a lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.push(list.new Node(1));
        list.push(list.new Node(2));
        list.push(list.new Node(3));

        System.out.println("Initial List:");
        list.printList(); // Output: 1 -> 2 -> 3 -> null

        System.out.println("Element at index 1: " + list.elementAt(1).getData()); // Output: 2

        list.insert(1, list.new Node(4));
        System.out.println("List after inserting 4 at index 1:");
        list.printList(); // Output: 1 -> 4 -> 2 -> 3 -> null

        list.remove(2);
        System.out.println("List after removing element at index 2:");
        list.printList(); // Output: 1 -> 4 -> 3 -> null

        System.out.println("Popped element: " + list.pop().getData()); // Output: 3
        System.out.println("List after popping the last element:");
        list.printList(); // Output: 1 -> 4 -> null

        System.out.println("Size of the list: " + list.size()); // Output: 2
    }
}

