import java.lang.Iterable;
import java.util.*;

class LinkedStack <Item> implements Stack <Item>{
    private Node head; // the first node
    private int size; // number of items

    // nested class to define node
    private class Node {
        Item item;
        Node next;
    }

    // zero argument constructor
    public LinkedStack() {
        head = null;
        size = 0;
    }

    //check if stack is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    // remove item from the beginning of the list
    public Item pop() {
        Item item = head.item;
        head = head.next;
        size--;
        return item;
    }

    // add item to the beginning of the list
    public void push(Item item) {
        Node oldHead = head;
        head = new Node();
        head.item = item;
        head.next = oldHead;
        size++;
    }

    public int size() {
        return size;
    }

    //Iterator for traversing stack items
    public Iterator<Item> iterator() {
        return new LinkedStackIterator();
    }

    //inner class to implement iterator interface
    private class LinkedStackIterator implements Iterator <Item> {
        private int i = size;
        private Node first = head; //the first node

        public boolean hasNext() {
            return (i>0);
        }

        public Item next() {
            Item item = first.item;
            first = first.next;
            i--;
            return item;
        }

        public void remove() {
            // not needed
        }
    }
}