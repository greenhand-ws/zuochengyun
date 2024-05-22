package com.ws.zuochengyun.p4;

import com.ws.zuochengyun.common.Common;

/**
 * @author shun.wang
 * @description 快排
 * @date 2024-05-22 15:01
 **/
public class P4_6 {
    /**
     * 快排3.0版本
     *
     * @param arr
     */
    public static void fastSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * 递归：终止条件  left==right    逻辑：  swap + partition
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            Common.swap(arr, left + (int) (Math.random() * (right - left + 1)), right);
            int[] p = partition(arr, left, right);
            quickSort(arr, left, p[0] - 1);
            quickSort(arr, p[1] + 1, right);
        }
    }

    /**
     * 这是一个处理arr[l...r]的函数
     * 返回区域的左边界，右边界  数组长度必为2
     * 这个部分跟荷兰国旗问题逻辑基本一致
     * @param arr
     * @param L
     * @param R
     * @return
     */
    public static int[] partition(int[] arr, int L, int R) {
        //小于区边界
        int less = L - 1;
        //大于区边界
        int more = R;
        while (L < more) {
            if (arr[L] < arr[R]) {
                Common.swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                Common.swap(arr, --more, L);
            } else {
                L++;
            }
        }
        Common.swap(arr, more, R);
        return new int[]{less + 1, more};
    }

    public static void main(String[] args) {

    }
}
