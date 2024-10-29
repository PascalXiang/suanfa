package org.example.chazhao.xianxing;

/**
 * Created by Pascal on 2024/10/1.
 */
public class ArrayGenerator {
    private ArrayGenerator(){}

    public static Integer[] arrayOrderedGenerator(int n){
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }
}
