package com.itheima.ifDemo;

import java.util.Scanner;

public class switchDemo1 {
    public static void main(String[] args) {
        //1.键盘录入数据（星期数）
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数");
        int week = sc.nextInt();
        //2.使用switch语句判断星期数

        switch(week){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入的星期数不合法");
                break;
        }
    }
}
