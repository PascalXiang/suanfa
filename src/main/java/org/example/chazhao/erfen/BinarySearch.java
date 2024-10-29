package org.example.chazhao.erfen;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.temporal.Temporal;

/**
 * Created by Pascal on 2024/10/17.
 */
@Data
public class BinarySearch {
    // 写法1
    public static int binarySearchBasic1(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = (i + j) >>> 1;
            if (arr[temp] == target) {
                return temp;
            }
            if (arr[temp] < target) {
                i = temp + 1;
            }
            if (arr[temp] > target) {
                j = temp - 1;
            }
        }
        return -1;
    }

    // 写法2
    public static int binarySearchBasic2(int[] arr, int target) {
        int i = 0;
        int j = arr.length;
        while (i < j) {
            int temp = (i + j) >>> 1;
            if (arr[temp] > target) {
                j = temp;
            } else if (arr[temp] < target) {
                i = temp + 1;
            } else return temp;
        }
        return -1;
    }

    // 写法3：平衡版(减少循环内比较次数)
    public static int binarySearchBasic3(int[] arr, int target) {
        int i = 0;
        int j = arr.length;
        while (1 < j - i) {
            int temp = (i + j) >>> 1;
            if (target < arr[temp]) {
                j = temp;
            }else {
                i = temp;
            }
        }
        if (arr[i] == target) {
            return i;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(binarySearchBasic1(arr, 4));
        System.out.println(binarySearchBasic2(arr, 4));
    }

}
