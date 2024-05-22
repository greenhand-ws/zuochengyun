package com.ws.zuochengyun.p3.ExclusiveOR.sort;

/**
 * @author shun.wang
 * @description 二分查找
 * @date 2024-03-05 14:34
 **/
public class TwoSearch {
    public static int twoSearch(int[] arr,int target) {
        if (arr == null) {
            return 0;
        }
        if (arr.length < 2) {
            return arr[0];
        }
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


    /**
     * 二分法进阶：在一个有序数组中，找到 >= 某个数最左侧的位置
     * 先通过二分法找到第一个满足条件的t1
     * 在他左边二分再找一个满足条件的t2
     * 再找再找，最后取t最小的
     * @param arr
     * @param target
     * @return
     */
    public static int twoSearchPromote1(int[] arr, int target) {
        return 0;
    }

    /**
     * 二分法进阶进阶；局部最小值
     * arr中 无序  相邻的两个数一定不相同
     * 对于arr[0]位置值来说，只要arr0<arr1，那么他就是局部最小
     * 对于arr[n-1]位置值来说，只要arrn-1 <arrn-2，那么他就是局部最小
     * 其他的arr[i],需要比arri-1和arri+1都小，才行
     * 现在要求用小于on的时间复杂度求出任一局部最小值
     * @param arr
     * @param target
     * @return
     */
    public static int twoSearchPromote2(int[] arr, int target) {
        /**
         * 如果两头不是局部最小的话，那么在他的中间一定存在一个局部最小
         */
        return 0;
    }


    public static void main(String[] args) {
        int[] arr=new int[]{1,3,5,7,9};
        System.out.println(twoSearch(arr, 6));
    }
}
