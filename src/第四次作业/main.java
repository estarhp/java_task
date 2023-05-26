package 第四次作业;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class main {



    private static  int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            // 判断是否越界
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;
            rev = rev * 10 + digit;
            x /= 10;
        }
        return rev;
    }

    private  static  int palouti(int n){
        if (n==1 || n==2){
            return n;
        }
        else return palouti(n-1) +palouti(n-2);
    }



    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();
        int input = -123;
        System.out.println(reverse(input));

        System.out.println(palouti(15));

        int[] array  = {1,2,3};
        Solution solution  = new Solution();
        System.out.println(solution.subsets(array));



    }







}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> subset, int[] nums, int start) {
        result.add(new ArrayList<>(subset));
        for (int i = start; i < nums.length; i++) {
            subset.add(nums[i]);
            backtrack(result, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }
}




