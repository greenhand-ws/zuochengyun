package com.ws.zuochengyun.p4;

/**
 * @author shun.wang
 * @description 递归求数组的最大值
 * @date 2024-05-08 10:43
 **/
public class P4_1 {
    public static int getMax(int[] arr,int left ,int right) {
        if (left == right) {
            return arr[left];
        }
        int middle=(left+right)>>1;
        int leftMax = getMax(arr, left, middle);
        int rightMax = getMax(arr, middle + 1, right);
        return Math.max(leftMax, rightMax);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getMax(arr, 0, arr.length - 1));
    }
}
