public class first {
    public static void main(String[] args) {
        System.out.println(" 1、D \n 2、B \n 3、D \n 4、B \n 5、B ") ;
        showTriangle(4);
        reverseString("hello");
        isPalindrome(12321);
        isPalindrome(12345);

        ShuiXianHua();

        arraysDemo(new int[]{1, 2, 3, 45, 6, 7, 0, 4, 3, 4});


    }
    public static void showTriangle(int n){
        int max=2*n-1;
        String a=" ";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <( max-(i*2+1))/2; j++) {
                System.out.print(a);
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void reverseString(String s) {


        char[] chars = s .toCharArray();
        int len=chars.length;
        for (int i = 0; i < len/2; i++) {
            char temp=chars[i];
            chars[i]=chars[len-i-1];
            chars[len-i-1]=temp;
        }
        String s1 = String.valueOf(chars);
        System.out.println(s1) ;
    }
    public static void isPalindrome(int num) {
        boolean flag = true;
        char a[]=String.valueOf(num).toCharArray();
        int len=a.length;
        for (int i = 0; i < len/2; i++) {
            if(a[i]!=a[len-i-1]){
              flag=false;
              break;
            }
        }

        if (flag) {
            System.out.println("是的") ; } else
            System.out.println("不是") ; }

    public static void ShuiXianHua() { //思考哪些数是水仙花
        for (int i = 100; i < 1000; i++) {
            int a = i / 100; // 获取百位数
            int b = (i % 100) / 10; // 获取十位数
            int c = i % 10; // 获取个位数
            if (a * a * a + b * b * b + c * c * c == i) { // 判断是否为水仙花数
                System.out.printf("%d ",i);
            }
            }
        }

    public static void arraysDemo(int arr[]) { //操作
        int max=arr[0];
        int min=arr[0];
        for (int i: arr
             ) {
            if (max < i) {
                max = i;
            }
            if(min>i){
                min=i;
            }
        }

        System.out.println();
        System.out.printf("max=%d,min=%d",max,min);


    }




}