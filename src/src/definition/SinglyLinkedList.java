package definition;

import adt.SinglyADT;

public class SinglyLinkedList<E> implements SinglyADT<E> {
    private Node<E> head = null;

    public int getSize() {
        return size;
    }


    private int size = 0;

    public Node<E> getNode(int index) {
        Node<E> response = head;
        if (index < 0 && index < size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 0; i < index && head != null; i++) {
                response = response.next;
            }
        }
        return response;
    }


    @Override
    public void add(E item) {

    }

    @Override
    public void remove() {

    }

    @Override
    public int search(E item) {
        return 0;
    }

    @Override
    public void sort() {

    }

    @Override
    public void print() {

    }

    private static class Node<E> implements Comparable<E> {
        private E data;

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }

        private Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public int compareTo(E e) {
            return 0;
        }
    }
}
