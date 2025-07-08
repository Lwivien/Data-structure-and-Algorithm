package cn.itcast.algorithm.test;

import cn.itcast.algorithm.sort.Insertion;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] arr = {4,3,2,10,12,1,5,6};
        Insertion.sort(arr);
        //将数组 arr 转换成一个字符串形式的表示，方便打印。
        System.out.println(Arrays.toString(arr));
    }
}
