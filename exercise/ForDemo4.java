package com.itheima.loopfor;

public class ForDemo4 {
    public static void main(String[] args) {

        /*需求:键盘录入两个数字，表示一个范围
        统计这个范围中，既可以被3整除，又可以被5整除的数字有多少个
         */

        //键盘录入两个数字
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int b = sc.nextInt();

        int sum = 0;

        //找最大值
        int max = a > b ? a : b;
        int min = a < b ? a : b;

        //循环获取数字
        for(int i = min; i <= max; i++) {

            //判断
            if (i % 3 == 0 && i % 5 == 0) {
                sum++;

            }

        }




        if (sum == 0) {
            System.out.println("没有找到符合条件的数字");
        } else {
            System.out.println("有" + sum + "个数字符合条件");
        }








    }
}
