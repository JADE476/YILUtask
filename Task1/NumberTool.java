package Task1;

import java.util.Scanner;

public class NumberTool {
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

    //打印菜单
    System.out.println("菜单");
    System.out.println("1.判断奇偶");
    System.out.println("2.输入正整数，计算并输出1-n求和");
    System.out.println("3.判断闰年");
    System.out.println("0.退出");

    while(run) {
    //用户输入
    System.out.println("请输入选项：");

    int option = sc.nextInt();

    switch (option) {
        case 1:
            oddOrEven();
            break;

        case 2:
            sum();
            break;

        case 3:
            RunYear();
            break;

        case 0:
            System.out.println("退出程序");
            run = faise;
            break;

        default:
            System.out.println("请输入可执行的选项");
    }
}
    }
    //1.判断奇偶
    public static void oddOrEven(){

        Scanner sc = new Scanner (System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + "是偶数");
        }else{
            System.out.println(num + "是奇数");
        }
    }
    //2.计算并输出1-n的和
    public static void sum(){
        Scanner sc = new Scanner (System.in);
        int sum = 0;
        System.out.println("请输入一个正整数：");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            sum = sum + i;
        }
        System.out.println("和是：" + sum);
    }


    //判断闰年
    public static void RunYear(){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        //末尾两位为0：前两位除以四
        //末尾两位不是0：后两位除以四

        if( year%100 == 0 && year%400 == 0 || year % 100!=0 && year % 4 == 0 ){
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }
    }
}
