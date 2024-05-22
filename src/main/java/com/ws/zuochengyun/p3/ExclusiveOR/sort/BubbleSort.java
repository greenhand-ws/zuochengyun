package com.ws.zuochengyun.p3.ExclusiveOR.sort;

import com.ws.zuochengyun.common.Common;

/**
 * @author shun.wang
 * @description 冒泡排序(1，2比较，大的右移。3，4比较，大的右移)
 * @date 2024-03-04 14:52
 **/
public class BubbleSort {

    public void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] < arr[j + 1]) {
                    Common.swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
