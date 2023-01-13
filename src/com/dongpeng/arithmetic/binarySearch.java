package com.dongpeng.arithmetic;

import java.util.Arrays;

/**
 * Java实现二分查找
 *
 * @auther Seb's
 * @date 2022/07/07 13:34
 */
public class binarySearch {
    public static void main(String[] args) {
        /*int[] arr = {10,2,3,8,6,12,7,30};
        Arrays.sort(arr);

        System.out.println("数组排序后结果"+Arrays.toString(arr));
        System.out.println("'3'的下标是"+binarySearchArrays(arr,3));
        System.out.println("'26'的下标是"+binarySearchArrays(arr,26));
        int index = binarySearchIterate(arr,3);
        System.out.println("'3'在数组重的下标是"+index);*/
        int[] arr = {10, 14, 16, 16, 16, 16, 16, 88,100};
        int index2 = upperBinarySearch(arr, 16);
        System.out.println(index2);


    }

    /**
     * Des：二分查找-Arrays的binarySearch方法
     *
     * @param arr  要排序的数组
     * @param item 要找的数据
     * @description:
     * @author: alex
     * @return: 索引，如果元素不存在，直接返回-1
     */
    public static int binarySearchArrays(int[] arr, int item) {
        int index = Arrays.binarySearch(arr, item);
        return index;
    }

    /**
     * Des：二分查找-迭代
     *
     * @param arr  要排序的数组
     * @param item 要找的数据
     * @description:
     * @author: alex
     * @return: 索引，如果元素不存在，直接返回-1
     */
    public static int binarySearchIterate(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) { //循环，直到低位和高位之间没有数
            int mid = (low + high) / 2;//中间数的下标
            if (arr[mid] < item) {
                low = mid + 1;
            } else if (arr[mid] > item) {
                high = mid - 1;
            } else if (arr[mid] == item) {
                return mid;
            }
        }
        return -1;
    }

    /**
     * Des：二分查找-递归
     *
     * @param arr  要排序的数组
     * @param item 要找的数据
     * @description:
     * @author: alex
     * @return: 索引，如果元素不存在，直接返回-1
     */
    public static int binarySearchRecursion(int[] arr, int item, int low, int high) {
        if (low > high)
            return -1;
        int mid = (low + high) / 2;
        if (arr[mid] > item)//中间的数大于要找的数
            return binarySearchRecursion(arr, item, low, mid - 1);//递归，高位改成中间数字下标-1位
        else if (arr[mid] < item)
            return binarySearchRecursion(arr, item, mid + 1, high);
        else
            return mid;
    }

    /**
     * Des：二分查找-上边界值
     *
     * @param arr  要排序的数组
     * @param data 要找的数据
     * @description:
     * @author: alex
     * @return: 索引，如果元素不存在，直接返回-1
     */
    public static int upperBinarySearch(int[] arr, int data) {
        int low = 0; //低位
        int height = arr.length;//高位
        int item = -1;//要找的数的下标。
        int count = 0;
        while (low < height) {
            count++;
            int mid = (low + height) / 2;
            if (data == arr[mid]) {
                item = mid;
                low = mid + 1;
            } else if (data < arr[mid]) {
                height = mid;
            } else if (data > arr[mid]) {
                low = mid + 1;
            }
        }
        System.out.println(count);
        return item;
    }



    /**
     * Des：二分查找-下边界值
     *
     * @param arr  要排序的数组
     * @param data 要找的数据
     * @description:
     * @author: alex
     * @return: 索引，如果元素不存在，直接返回-1
     */
    public static int lowerBinarySearch(int[] arr,int data){
        int low = 0;
        int height = arr.length;
        int item = -1;
        while (low < height){
            int mid = (low+height)/2;
            if (data == arr[mid]){
                item = mid;
                height = mid;//当找到目标数值开始往左找。
            }else if (data < arr[mid])
                height = mid;
            else if (data > arr[mid])
                low = mid + 1;

        }
        return item;
    }
}