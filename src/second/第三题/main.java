package second.第三题;

import java.util.*;

public class main {
    public static void main(String[] args) {
     String sum=getSum("13829579081298345918257","438823897418920918472193");
     System.out.println(sum);
    }
    public static String getSum(String a,String b){
        List<Integer> la = new ArrayList<Integer>();
        List<Integer> lb = new ArrayList<Integer>();
        List<Integer> lc = new ArrayList<Integer>();


             for(int i = a.length()-1;i >= 0;--i){
                     la.add(a.charAt(i)-'0');
                 }
             for(int i = b.length()-1;i >= 0;--i){
                     lb.add(b.charAt(i)-'0');
                  }

             Collections.reverse(la);
             Collections.reverse(lb);
        if (la.size()>lb.size()){
            for (int i=0;i< la.size()- lb.size();i++){
                lb.add(0,0);
            }
        }else if (la.size()<lb.size()){
            for (int i=0;i< lb.size()-la.size();i++){
                la.add(0,0);
            }
        }

        for (int i = 0; i < la.size(); i++) {
            lc.add(la.get(i)+ lb.get(i));
        }

        while (isOver(lc)){
            for (int i = 1; i < lc.size(); i++) {
                if(lc.get(i)>9){
                    lc.set(i,lc.get(i)-10);
                    lc.set(i-1,lc.get(i-1)+1);
                }
            }
        }



        StringBuilder sb = new StringBuilder();
        for (int i: lc
             ) {
            sb.append(i);
        }

        String c = sb.toString();
        return c;
    }
    public static boolean isOver( List<Integer> lc){
        for (int i = 1; i < lc.size(); i++) {
            if (lc.get(i)>9) return true;
        }
        return false;
    }
}
