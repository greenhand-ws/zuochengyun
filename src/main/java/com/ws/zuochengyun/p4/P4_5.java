package com.ws.zuochengyun.p4;

import com.ws.zuochengyun.common.Common;

import java.util.Arrays;

/**
 * @author shun.wang
 * @description 荷兰国旗问题
 * @date 2024-05-22 10:29
 **/
public class P4_5 {
    /**
     * 小的放前，大的放后
     * @param arr
     * @param num
     */
    public static void process(int[] arr, int num) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //代表小于num的最大index
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < num) {
                Common.swap(arr, index + 1, i);
                index++;
            }
        }
    }

    /**
     * 小的放前，大的放后，相等的放中间
     * @param arr
     * @param num
     */
    public static void process1(int[] arr, int num) {
        if (arr == null || arr.length < 2) {
            return;
        }
        //代表小于num的最大index
        int left = -1;
        int right= arr.length;
        int index = 0;

        //使用while，方便控制终止条件
        while (index < right) {
            if (arr[index] < num) {
                Common.swap(arr, left + 1, index);
                left++;
                index++;
            } else if (arr[index] > num) {
                Common.swap(arr, right - 1, index);
                right--;
            } else if (arr[index] == num) {
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 2, 5,4};
        //process(arr, 3);
        process1(arr, 4);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
