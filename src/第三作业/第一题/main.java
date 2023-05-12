//1.
//        利用接口做参数，写个计算器，能完成加减乘除运算。
//        （1）定义一个接口 Compute 含有一个方法 int computer(int n, int m)。
//        （2）设计四个类分别实现此接口，完成加减乘除运算。
//        （3）设计一个类 UseCompute，类中含有方法：public void useCom(Compute com,
//        int one, int two)，
//        此方法能够用传递过来的对象调用 computer 方法完成运算，并输出运算的
//        结果。
//        （4）设计一个主类 Test，调用 UseCompute 中的方法 useCom 来完成加减乘除运算。
package 第三作业.第一题;

public class main {

    public static void main(String[] args) {
        UseCompute useCompute = new UseCompute();
        Jia jia = new Jia();
        Jian jian = new Jian();
        Cheng cheng = new Cheng();
        Chu chu = new Chu();

        useCompute.useCom(jia,1,2);

        useCompute.useCom(jian,1,2);
        useCompute.useCom(cheng,1,2);
        useCompute.useCom(chu,1,2);





    }
}

interface Compute {
    int computer(int n, int m);
}

class Jia implements Compute{
    @Override
    public int computer(int n, int m) {
        return n+m;
    }

}

class Jian implements Compute{
    @Override
    public int computer(int n, int m) {
       return n-m;
    }

}

class Cheng implements Compute{
    @Override
    public int computer(int n, int m) {
       return n*m;
    }

}

class Chu implements Compute{
    @Override
    public int computer(int n, int m) {
        return n/m;
    }

}


class UseCompute {
    public void useCom(Compute com, int one, int two){
         System.out.println(com.computer(one,two));
    }
}









