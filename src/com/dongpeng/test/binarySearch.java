package com.dongpeng.test;

import java.util.Arrays;

/**
 * Java实现二分查找
 *
 * @auther Seb's
 * @date 2022/07/07 13:34
 */
public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {10,2,3,8,6,12,7};
        Arrays.sort(arr);
        System.out.println("数组排序后结果"+Arrays.toString(arr));
        System.out.println("'3'的下标是"+binarySearchArrays(arr,3));
        System.out.println("'26'的下标是"+binarySearchArrays(arr,26));

    }
    /**
     * Des：二分查找-Arrays的binarySearch方法
     * @param arr 以排序的数组
     * @param item 要找的数据
     * @description:
     * @author:      alex
     * @return: 索引，如果元素不存在，直接返回-1
     */
    public static int binarySearchArrays(int[] arr,int item){
        int index = Arrays.binarySearch(arr,item);
        return index;
    }

    /**
     * Des：二分查找-迭代
     * @param arr 以排序的数组
     * @param item 要找的数据
     * @description:
     * @author:      alex
     * @return: 索引，如果元素不存在，直接返回-1
     */
    public static int binarySearchIterate(int[] arr,int item){
       int low = 0 ;
       int high = arr.length-1;
       while(low <= high){
           int mid = (low+high)/2;//中间数的下标
           if (arr[mid] < item){
               low = mid+1;
           }else if (arr[mid] > item){
               high = mid-1;
           }else if (arr[mid] == item){
               return mid;
           }
       }
       return -1;
    }

    /**
     * Des：二分查找-递归
     * @param arr 以排序的数组
     * @param item 要找的数据
     * @description:
     * @author:      alex
     * @return: 索引，如果元素不存在，直接返回-1
     */
    public static int binarySearchRecursion(int[] arr,int item,int low,int high){
        if (low > high)
            return -1;
        int mid = (low+high)/2;
        if (arr[mid]>item)//中间的数大于要找的数
            return binarySearchRecursion(arr,item,low,mid-1);//递归，高位改成中间数字下标-1位
        else if(arr[mid]<item)
            return binarySearchRecursion(arr,item,mid+1,high);
        else
            return mid;
    }
}
