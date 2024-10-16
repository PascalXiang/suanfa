package org.example.xuanzepaixu;

import org.example.xianxingchazhao.Student;

/**
 * Created by Pascal on 2024/10/7.
 * 选择排序
 */
public class SelectionSort {
    private SelectionSort(){
    }

    public static <E extends Comparable<E>> void Sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
                swap(arr,i,minIndex);
            }
        }
    }

    public static <E extends Comparable<E>> void anoSort(E[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = i; j > 0 ; j--) {
                if (arr[j].compareTo(arr[i]) > 0) {
                    maxIndex = j;
                }
            }
            swap(arr,i,maxIndex);
        }
    }

    private static <E extends Comparable<E>>void swap(E[] arr, int i, int j) {
        E mid = arr[i];
        arr[i] = arr[j];
        arr[j] = mid;
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,5,4,3};
        SelectionSort.Sort(arr);
        for (int e : arr) {
            System.out.println(e);
        }
        Student[] students = {
                new Student("Pascal",100),
                new Student("Lzm",99),
                new Student("Log", 90)
        };
        SelectionSort.Sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        // 倒序选择排序
        SelectionSort.anoSort(arr);
        for (int e : arr) {
            System.out.println(e);
        }
    }
}
