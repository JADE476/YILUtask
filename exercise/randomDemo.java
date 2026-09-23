package com.itheima.breakANDcontinue;

import java.util.Random;
import java.util.Scanner;

public class randomDemo {
    public static void main(String[] args) {

        //生成随机数
        Random r = new Random();
        int n = r.nextInt(1,100) + 1;

        //生成两个计数器
        int countA = 0;
        int countB = 0;


        while (true) {
            //键盘录入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数字：");
            int guess = sc.nextInt();

            //用户猜测一次，计数器自增一次
            countA++;
            countB++;

            //大保底
            if(countB == 10){
                //System.out.println("bingo，游戏结束");
                //break;
                guess = n;
            }


            //比较判断

            if(guess > n){
                System.out.println("猜大了");
            }else if(guess < n){
                System.out.println("猜小了");
            }else if(guess == n){
                System.out.println("猜对了");
                break;
            }

            //小保底
            if(countA % 3 ==0){
                System.out.println("触发小保底机制，随机数字范围" + (n-5) + "~" + (n+5));

            }
        }


    }
}
