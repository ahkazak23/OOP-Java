package lab11ex4;
import java.util.Random;

public class RandomList {
    
    private class Node {
        int value;
        Node next;
    }
    
    private Node head;
    
    public RandomList(int bound, int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int randomValue = rand.nextInt(bound);
            insert(randomValue);
        }
    }

    private void insert(int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        head = newNode;
    }

    public boolean isEmpty() {
        return (head == null);    
    }
    
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.value).append(" ");
            current = current.next;
        }
        return result.toString();
    }
    
    public void removeAdjacentDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.value == current.next.value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void removeAdjacentDuplicatesR() {
        removeAdjacentDuplicatesR(head);
    }

    private void removeAdjacentDuplicatesR(Node current) {
        if (current == null || current.next == null) {
            return;
        }

        if (current.value == current.next.value) {
            current.next = current.next.next;
            removeAdjacentDuplicatesR(current);
        } else {
            removeAdjacentDuplicatesR(current.next);
        }
    }

    private int getMax() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }

        int max = head.value;
        Node current = head.next;

        while (current != null) {
            max = Math.max(max, current.value);
            current = current.next;
        }

        return max;
    }

    public void removeMaxValues() {
        int max = getMax();
        Node dummy = new Node();
        dummy.next = head;
        Node prev = dummy;
        Node current = head;

        while (current != null) {
            if (current.value == max) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        head = dummy.next;
    }

    public static void main(String[] args) {
        RandomList list = new RandomList(4,15);
        System.out.println("First Random list:"  + System.lineSeparator()+ list + System.lineSeparator());
        list.removeAdjacentDuplicates();
        System.out.println("List with adjacent duplicates removed:" +
                           System.lineSeparator() + list + System.lineSeparator());

        RandomList list2 = new RandomList(4,15);
        System.out.println("Second Random list:"  + System.lineSeparator()+ list2 + System.lineSeparator());
        list2.removeAdjacentDuplicatesR();
        System.out.println("List with adjacent duplicates removed recursively:" +
                           System.lineSeparator() + list2 + System.lineSeparator());

        RandomList list3 = new RandomList(4,15); // make a new list
        System.out.println("A Third Random list:" + System.lineSeparator() + list3 + System.lineSeparator());
        System.out.println("Successively removing max values:");
        while (! list3.isEmpty()) {
            list3.removeMaxValues();
            System.out.println(list3);
        }
    }
}
