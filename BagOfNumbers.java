import java.util.*;

public class BagOfNumbers {
    ArrayList<Integer> bag = new ArrayList<>();

    void add(int x) {
        bag.add(x);
    }

    void remove(int x) {
        bag.remove(Integer.valueOf(x));
    }

    int countOccurrences(int x) {
        int count = 0;
        for (int num : bag)
            if (num == x) count++;
        return count;
    }

    boolean isEmpty() {
        return bag.isEmpty();
    }

    int size() {
        return bag.size();
    }

    void display() {
        System.out.println(bag);
    }

    public static void main(String[] args) {
        BagOfNumbers bag = new BagOfNumbers();

        bag.add(5); bag.add(10); bag.add(5); bag.add(20);
        System.out.println("Bag contents: ");
        bag.display();

        System.out.println("Count occurrences of 5: " + bag.countOccurrences(5));

        bag.remove(5);
        System.out.println("After removing 5: ");
        bag.display();

        System.out.println("Is bag empty? " + bag.isEmpty());
    }
}
