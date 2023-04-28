package second.第五题;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
         String max="";


         //只写三个数的情况了，也不考虑多个最大公共
         //只写三个数的情况了，也不考虑多个最大公共

         String[] strs={"f1ower","f1ow","f1ight"};

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = i+1; j <= strs[0].length(); j++) {
                String p=strs[0].substring(i,j);
                if (strs[1].contains(p)&&strs[2].contains(p)&&p.length()>=max.length()){
                         max=p;
                }

            }
        }

        System.out.println(max);

    }

}
