package com.andersenlab.binarysearch;

public class BinarySearch {

    public static Element find(Element[] array, int value) {
        return binarySearch(array, 0, array.length - 1, value);
    }

    private static Element binarySearch(Element[] array, int first, int last, int value) {

        if (last >= first) {
            int middle = first + (last - first) / 2;

            if (array[middle].getValue() == value) {
                return array[middle];
            }
            if (array[middle].getValue() > value) {
                return binarySearch(array, first, middle - 1, value);
            }
            return binarySearch(array, middle + 1, last, value);
        }
        throw new IllegalArgumentException();
    }
}
