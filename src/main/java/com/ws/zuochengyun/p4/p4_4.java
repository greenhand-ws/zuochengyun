package com.ws.zuochengyun.p4;

/**
 * @author shun.wang
 * @description 归并排序拓展 求小和
 * @date 2024-05-21 22:30
 **/
public class p4_4 {
    /**
     * 求小和问题
     * @param arr
     * @return
     */
    public static int sumSmallArray(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }
        return process(arr, 0, arr.length - 1);
    }

    private static int process(int[] arr, int left, int right) {
        if (left == right) {
            return 0;
        }
        int mid = left + ((right - left) >> 1);
        return process(arr, left, mid)+process(arr, mid + 1, right)+merge(arr, left, mid, right);
    }

    private static int merge(int[] arr, int left, int middle, int right) {
        int[] help = new int[right - left + 1];
        int count = 0;
        int i = left;
        int j = middle + 1;
        int index = 0;
        while (i <= middle && j <= right) {
            count += arr[i] < arr[j] ? (right - j + 1) * arr[i] : 0;
            help[index++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
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
        return count;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 2, 5};
        System.out.println(sumSmallArray(arr));
    }
}
