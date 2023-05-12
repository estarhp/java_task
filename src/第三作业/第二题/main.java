//2.
//        编写程序接收用户输入分数信息，如果分数在 0—100 之间，输出成绩。如果成
//        绩不在该范围内，抛出异常信息，提示分数必须在 0—100 之间。
package 第三作业.第二题;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("请输入一个分数");
       int score = input.nextInt();
       if (score >= 0 && score <= 100) {
           System.out.println(score);
       }else {
           System.out.println("分数必须在 0—100 之间");
       }
    }
}
