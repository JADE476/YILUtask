package Task2;

import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {

        int[] scores = {72,85,91,60,85,78,95,60};

        //1.找最大值
        int maxScore = findMax(scores);
        System.out.println("The maximum score is: " + maxScore);
        //2.键盘录入一个成绩，判断是否存在
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        int target = sc.nextInt();

        boolean result = contains(scores, target);
        System.out.println(result);

        //3.返回从高到低排序的新数组
        int[] newScores = new int[scores.length];
        newScores = sortDescending(scores);
        for (int i = 0; i < newScores.length; i++) {
            System.out.println(newScores[i] + " ");
        }



        //4.求平均值
        System.out.println("The average score is: " + average(scores));

        //5.返回去重后的新数组
        int[] noRepeat = deduplicate(scores);
        for (int i = 0; i < noRepeat.length; i++) {
            System.out.println(noRepeat[i] + " ");
        }

    }

    public static int findMax(int[] scores) {
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > max){
                max = scores[i];
            }
        }
        return max;

    }

    public static boolean contains(int[] scores, int target) {
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] == target){
                return true;
            }
        }
        return false;
    }

    public static int[] sortDescending(int[] scores) {
        int[] newScores = new int[scores.length];
        int slow = 0;
        int fast = 1;
        while (slow < scores.length - 1) {
            if(scores[slow] < scores[fast]){
                int temp = scores[slow];
                scores[slow] = scores[fast];
                scores[fast] = temp;
            }
            fast++;
            if(fast == scores.length){
                slow++;
                fast = slow + 1;
            }
        }
        return scores;

    }

    public static int average(int[] scores){
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum = sum +scores[i];
        }
        int average = sum / scores.length;
        return average;
    }

    public static int[] deduplicate(int[] scores) {
        int[] noRepeat = new int[scores.length];
        noRepeat[0] = scores[0];
        int slow = 0;
        int fast = 1;

        while(slow < scores.length - 1&& fast < scores.length){
            if(scores[slow] == scores[fast]){
                fast++;
            }else{
                slow++;
                noRepeat[slow] = scores[fast];
                fast++;
            }
        }
        return noRepeat;





    }
}
