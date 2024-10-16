package org.example.xianxingchazhao;

import java.util.Scanner;

/**
 * Created by Pascal on 2024/9/26.
 */

public class LinearSearch<E> {
    private LinearSearch() {
    }

    public static <E> int search(E[] data, E target){
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        Integer[] data = {12,2,4,656};
//        int target = 4;
//        System.out.println(LinearSearch.search(data, target));

//        Student[] students = {new Student("Pascal"),new Student("Lzm")};
//        System.out.println(LinearSearch.search(students, new Student("Pascal")));
        int i = 100000000;
        long startTime = System.nanoTime();
        Integer[] array = new Integer[0];
        for (int j = 0; j < 100; j++) {
            array = ArrayGenerator.arrayOrderedGenerator(i);
        }
        LinearSearch.search(array, i);
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        System.out.println("所花费的时间为:" + time);
    }
}
