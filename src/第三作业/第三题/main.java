//3.
//        编写一个计算 N 个整数平均值的程序。程序提示用户输入，必须输入所有 N 个数。如果用户输入的值是一个负数，则应该抛出一个异常并捕获，
//        提示“必须是正数或者0”。并提示用户再次输入该数。
package 第三作业.第三题;

import java.util.Scanner;

public class main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三个数字就好了：");
        int sum = 0;
        for (int i = 0; i < 3; i++) {


            if(sum > (sum += input.nextInt())){
                System.out.println("负数是不被允许的哟！！(必须是正数或者0)");

                return;
            }


        }

        System.out.println(sum/3.0);
    }
}
