package org.example.sort.charu;

/**
 * Created by Pascal on 2024/10/17.
 */
public class InsertionSort {

    private InsertionSort(){

    }

    public static <E extends Comparable<E>> void insertionSort(E[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1;j--) {
                if (arr[j].compareTo(arr[j-1]) < 0){
                    swap(arr, j, j-1);
                }
                else break;
            }
        }
    }

    public static <E extends Comparable<E>> void sort2(E[] arr) {   // 优化版 321 331 231 233 223 123
        for (int i = 1; i < arr.length; i++) {
            E temp = arr[i];  // 暂存当前位置元素
            int j;  // arr[i]实际应当存放位置的索引
            for (j = i; j >= 1  && temp.compareTo(arr[j-1]) < 0; j--) {  // 如果当前元素值小于前一位元素，则不为应当插入的位置，将j-1位置的元素向后平移一位， j--再去寻找前一位元素进行比较
                arr[j] =  arr[j-1];
            }
            arr[j] = temp;  // 当前循环结束，j即为应存位置
        }
    }


    private static <E extends Comparable<E>>void swap(E[] arr, int i, int j) {
        E mid = arr[i];
        arr[i] = arr[j];
        arr[j] = mid;
    }

    public static void main(String[] args) {
        Integer[] arr = {4,3,2,6,12,3,21};
        InsertionSort.insertionSort(arr);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
        InsertionSort.sort2(arr);
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }
}
