package com.bridgelabz.generics;

public class GenericDemoMax {
    public static <T extends Comparable<T>> T max(T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Integer Max: " + max(Integer.valueOf(32), Integer.valueOf(56), Integer.valueOf(89)));
        System.out.println("Double Max: " + max(Double.valueOf(5.6), Double.valueOf(7.8),Double.valueOf(10.25)));
    }
    }
