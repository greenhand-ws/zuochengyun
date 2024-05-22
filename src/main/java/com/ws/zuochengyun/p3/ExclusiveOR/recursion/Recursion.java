package com.ws.zuochengyun.p3.ExclusiveOR.recursion;

/**
 * @author shun.wang
 * @description 递归
 * @date 2024-03-05 15:51
 **/
public class Recursion {
    /**
     * 求arr中从left到right最大值，递归法
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public static int process(int[] arr, int left, int right) {
        while (left < right) {
            if (arr[left] > arr[right]) {
                process(arr, left, right - 1);
            } else {
                process(arr, left-1, right);
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,3,2,6,8,5};
        System.out.println(process(arr,0,5));
    }
}
