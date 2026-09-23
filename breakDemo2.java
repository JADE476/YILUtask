package com.itheima.breakANDcontinue;

public class breakDemo2 {
    public static void main(String[] args) {

        //键盘录入一个大于等于2的整数，判断它是否为质数
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int num = 0;
        while (true) {
            System.out.println("请输入一个大于等于2的整数");
            num = sc.nextInt();
            if (num >= 2) {
                break;
            } else {
                System.out.println("输入的数字小于2，请重新输入");
            }
        }
        int count = 0;
        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("是质数");
        } else {
            System.out.println("不是质数");
        }
    }
}
