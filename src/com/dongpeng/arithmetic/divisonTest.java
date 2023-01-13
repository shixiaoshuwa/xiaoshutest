package com.dongpeng.arithmetic;

/**
 * Java中相除和取余的代码验证
 *
 * @auther Seb's
 * @date 2022/07/07 17:24
 */
public class divisonTest {
    public static void main(String[] args) {
        //打印除法运算结果
        System.out.println(divisonTest());;
    }

    /**
     * Java重的相除和取余
     * divison 除法
     */
    public static  String divisonTest(){
        int a = 13 / 5;
        int b = 13 % 5;
        int c = 5 / 13;
        int d = 5 % 13;
        int e = 13 / -5;
        int f = -13 / 5;
        int h = -13 % 5;
        int j = 13 % -5;
        String result = "a="+a+"，b="+b+"\nc="+c+"，d="+d+"\ne="+e+"，f="+f+"\nh="+h+"，j="+j;
        return result;
    }
}
