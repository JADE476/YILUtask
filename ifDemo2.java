package com.itheima.ifDemo;

import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {

        //1.定义变量记录游戏人物的生命值
        int hp = 200;
        //2.键盘输入一个值，表示当前人物收到的伤害
        System.out.println("请输入当前人物收到的伤害");
        Scanner sc = new Scanner(System.in);
        int damage = sc.nextInt();//判断正负

        //3.计算当前血量
        hp = hp-damage;

        if(hp <= 0){
            hp = 1;
            System.out.println("人物已死亡");
        }
        System.out.println("当前人物血量为"+hp);

    }
}
