package com.company.hashtable;

public class DesignHashMap_R {

    // your solution was correct, but let's implement hashmap with chaining















    int size = 1000000;
    Integer[] arr = new Integer[size];

    public void put(int key, int value) {
        arr[hash(key)] = value;
    }

    public int get(int key) {
        Integer value = arr[hash(key)];
        if (value == null) return -1;
        return value;
    }

    public void remove(int key) {
        arr[hash(key)] = null;
    }

    private int hash(int key) {
        return key % size;
    }
}
