package com.ws.zuochengyun.common;

/**
 * @author shun.wang
 * @description
 * @date 2024-03-04 15:16
 **/
public class Common {
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    /**
     * 在上面的基础上用位进行交换，不过需要保证
     * 两个进行交换的数，不是同一内存地址
     * @param arr
     * @param left
     * @param right
     */
    public static void swapPromote1(int[] arr, int left, int right) {
        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left] ^ arr[right];
        arr[left] = arr[left] ^ arr[right];
    }
}
