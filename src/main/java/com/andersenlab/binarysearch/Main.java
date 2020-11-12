package com.andersenlab.binarysearch;


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Element[] array = getArray(100);

        System.out.println(Arrays.toString(array));
        System.out.println(BinarySearch.find(array, 26));
    }

    public static Element[] getArray(int size) {
        Random random = new Random();
        Element[] result = new Element[size];

        for (int i = 0; i < size; i++) {
            result[i] = new Element(random.nextInt(1000));
        }

        Arrays.sort(result);
        return result;
    }
}
