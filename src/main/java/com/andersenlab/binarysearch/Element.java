package com.andersenlab.binarysearch;

public class Element implements Comparable<Element> {

    private int value;

    public Element(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Element element = (Element) o;

        return value == element.value;
    }

    @Override
    public int hashCode() {
        return value * 31;
    }


    @Override
    public String toString() {
        return "[value: " + value + " ]";
    }

    @Override
    public int compareTo(Element o) {
        return this.value - o.value;
    }
}
