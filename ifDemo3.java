package com.itheima.ifDemo;

public class ifDemo3 {
    /*
    1.如果大括号内容语句体只有一行，可以省略大括号
    2.小括号里面不能有分号
    3.判断布尔变量的类型，直接把变量写在小括号内部即可
     */
    public static void main(String[] args) {
        int score = 200;
        System.out.println("请输入成绩");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        score = sc.nextInt();
                if(score >=0 && score <=100){
                    if (score>=60){
                        System.out.println("pass");
                    }else{
                        System.out.println("fail");
                    }

                }else{
                    System.out.println("illegal");
                }
//if的嵌套


    }
}
