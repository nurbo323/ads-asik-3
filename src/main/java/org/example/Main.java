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
    }
}
