package com.ws.zuochengyun.p3.ExclusiveOR.sort;

import com.ws.zuochengyun.common.Common;

/**
 * @author shun.wang
 * @description 插入排序(每次循环保证0~n之间是有序的)
 * @date 2024-03-04 17:09
 **/
public class InsertSort {
    public void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    Common.swap(arr, j, j + 1);
                }else {
                    //在这个之前的数字都是有序的，所以无需再次比较
                    break;
                }
            }
        }
    }


    /**
     * 在上面的代码上，优化第二个for循环
     * @param arr
     */
    public void insertSortPromote1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                Common.swap(arr, j, j + 1);
            }
        }
    }


    public static void main(String[] args) {

    }
}
