package com.ws.zuochengyun.p3.ExclusiveOR.sort;

import com.ws.zuochengyun.common.Common;

/**
 * @author shun.wang
 * @description 选择排序（每次选择最小的一个放到最左边） 时间复杂度on2   空间复杂度
 * @date 2024-03-04 14:40
 **/
public class SelectSort {
    public void selectSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                minIndex = arr[j] < minIndex ? j : minIndex;
                Common.swap(arr,i,minIndex);
            }
        }
    }


    public static void main(String[] args) {

    }
}
