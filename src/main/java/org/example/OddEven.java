    package org.example;
    import java.util.Scanner;

    public class OddEven {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int jishu = 0;
            int oushu = 0;

            

            while (true) {
                int number = scanner.nextInt(); // 读取用户输入
                    if(number>100000||number<=0) {
                        System.out.println("输入错误，数字区间在(0,100000)");
                        break;
                    }
                else if (number == -1) {
                    break;
                }


                if (number % 2 == 0) {
                    oushu++;
                } else {
                    jishu++;
                }
            }

            // 输出结果
            System.out.println(jishu + " " + oushu);


        }
    }






