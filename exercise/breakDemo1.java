package com.itheima.breakANDcontinue;

public class breakDemo1 {
    public static void main(String[] args) {
        int hp = 200;


        java.util.Scanner sc = new java.util.Scanner(System.in);

        int hurt = 0;

        while(true){
             System.out.println("请输入人物受到的伤害");
             hurt = sc.nextInt();

             if(hurt > 0){
                 break;
             }else{
                 System.out.println("当前伤害不能为负数");
             }

        hp = hp - hurt;

             if(hp<=0){
                 hp = 1;
             }

             System.out.println("当前人物血量为"+hp);


        }
    }
}
