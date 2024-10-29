package org.example.sort.charu;
/**
 * Created by Pascal on 2024/10/17.
 */
public class Test {
    // 从右往左的插入排序实现
    public static <E extends Comparable<E>> void anoSort(E[] arr) {
        for (int i = arr.length - 2; i >= 0; i--) { // 从倒数第二个开始,倒数第一个默认已排序
            E temp = arr[i];
            int j = i + 1;
            // 找到插入的位置
            while (j < arr.length && arr[j].compareTo(temp) < 0) {
                arr[j-1] = arr[j];
                j++;
            }
            arr[j-1] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5,3,4,2,1};
        anoSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}