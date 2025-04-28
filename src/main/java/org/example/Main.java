package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing MyHashTable ---");

        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>();
        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = random.nextInt(100000);
            String name = "Name" + random.nextInt(100000);
            MyTestingClass key = new MyTestingClass(id, name);
            table.put(key, i);
        }

        System.out.println("Total elements inserted: " + table.getSize());
        table.printBucketSizes();

        // TEST BST
        System.out.println("\n--- Testing BST ---");

        BST<Integer, String> bst = new BST<>();
        bst.put(5, "five");
        bst.put(2, "two");
        bst.put(8, "eight");
        bst.put(1, "one");
        bst.put(3, "three");

        System.out.println("Element with key 2: " + bst.get(2));
        bst.delete(2);
        System.out.println("Element with key 2 after deletion: " + bst.get(2));

        System.out.println("All keys in BST (in-order traversal):");
        for (Integer key : bst.iterator()) {
            System.out.println(key);
        }
    }
}
