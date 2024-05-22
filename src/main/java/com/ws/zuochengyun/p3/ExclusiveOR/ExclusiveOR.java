package com.ws.zuochengyun.p3.ExclusiveOR;

/**
 * @author shun.wang
 * @description 异或习题
 * 1. 给定一批数，其中只有一种数为奇数，其他所有种类数都为偶数
 * 2. 给定一批数，其中有两种数为奇数，其他所有种类都为偶数
 * 3. 要求时间为on，空间为o1
 * @date 2024-03-04 16:25
 **/
public class ExclusiveOR {
    /**
     * 直接用0与所有值进行异或
     * @param arr
     * @return
     */
    public static int question1(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result = result ^ i;
        }
        return result;
    }

    /**
     * 由于有两种奇数的数字，所以所有的数进行异或之后，肯定是非0的值
     * 并且该值某一位是非0的值，就说明在该位上（假设是第4位），两个数是不同的
     * 也就是在该位，一个是0，一个是1
     * 然后此时，我们再进行一次所有值的异或，这里我们去除第4位为0或者为1的哪些值
     * 这样，我们最后的结果肯定要两种数之一
     * 总结：
     * 第一次所有值异或就是找到两个数不一样的值在第几位（肯定会有多位不一样，咱们取一个即可）
     * 第二次异或取第i位为0/1的所有值进行异或，结果一定为两种数之一
     * @param arr
     * @return
     */
    public static String question2(int[] arr) {
        int result = 0;
        //第一次异或
        for (int i : arr) {
            result = result ^ i;
        }
        //取出result中最右边一位的1
        int rightOne = result & (~result + 1);

        //第二次异或，用第i位为0的进行异或
        int result2 = 0;
        for (int i : arr) {
            if ((i & rightOne) == 0) {//i的第i位为0
                result2 = result2 ^ i;
            }
        }

        return String.valueOf(result2).concat(",").concat(String.valueOf(result ^ result2));
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,1,2,3,3,4,4};
        System.out.println(question1(arr));

        int[] arr2=new int[]{1,1,2,3,3,4,4,5};
        System.out.println(question2(arr2));
    }
}
