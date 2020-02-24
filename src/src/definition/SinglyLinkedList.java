package definition;

import adt.SinglyADT;

public class SinglyLinkedList<E> implements SinglyADT<E> {


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

        @Override
        public int compareTo(E e) {
            return 0;
        }
    }
}
