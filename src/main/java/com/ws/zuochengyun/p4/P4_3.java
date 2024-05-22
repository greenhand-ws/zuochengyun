package com.ws.zuochengyun.p4;

/**
 * @author shun.wang
 * @description 归并排序
 * @date 2024-05-08 10:43
 **/
public class P4_3 {
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }

    public static void process(int[] arr, int left, int right) {
        if (left == right) {
            return;
        }
        int middle = left + (right - left) >> 1;
        process(arr, left, middle);
        process(arr, middle + 1, right);
        merge(arr, left, middle, right);
    }

    /**
     * 合并：借助一个临时数组
     *
     * @param arr
     * @param left
     * @param middle
     * @param right
     */
    private static void merge(int[] arr, int left, int middle, int right) {
        int[] help = new int[right - left + 1];
        int i = left;
        int j = middle + 1;
        int index = 0;
        while (i <= middle && j <= right) {
            help[index++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= middle) {
            help[index++]=arr[i++];
        }
        while (j <= right) {
            help[index++]=arr[j++];
        }
        for (int h = 0; h < help.length; h++) {
            arr[left + h] = help[h];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        mergeSort(arr);
        System.out.println(arr);
    }
}
