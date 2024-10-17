package org.example;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner shuru = new Scanner(System.in);
        System.out.print("请输入一个非负整数：");
        int number = shuru.nextInt();
        if(number>=100000||number<0){
            System.out.println("输入错误输入范围值是(0,100000)");
        }
        else if(number>0){
            int result = cal(number);
            System.out.println(result);
        }


    }

    public static int cal(int number) {
        String num = String.valueOf(number);
        int binaryValue = 0;

        // 从个位开始遍历，位数从1开始
        for (int i = 0; i < num.length(); i++) {
            int digit = Character.getNumericValue(num.charAt(num.length() - 1 - i));
            int position = i + 1; // 位数从1开始

            // 判断数字和位数的奇偶性
            if ((digit % 2) == (position % 2)) {
                binaryValue += (1 << i); // 如果相同，则对应位加1
            }
        }

        return binaryValue;
    }
}
