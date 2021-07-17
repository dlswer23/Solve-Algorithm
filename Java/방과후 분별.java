import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {


        int num1, num2, num3, num4, num5;

        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        if (10 >= num1) {
            num1 = 10;

        }
        num2 = sc.nextInt();
        if (10 >= num2) {
            num2=10;
        }
        num3 = sc.nextInt();
        if (10 >= num3) {
            num3=10;
        }
        num4 = sc.nextInt();
        if (10 >= num4) {
            num4 = 10;
        }
        num5 = sc.nextInt();
        if (10 >= num5) {
            num5 = 10;
        }

        sc.close();

        int sum;
        sum = num1 + num2 + num3 + num4 + num5;
        double avg = sum / 5.0;
        System.out.println(Math.round(avg));


        if (num1 >= 45)
            System.out.println(num1 + " 다른 방과후 수업");
        else if (45 > num1 && num1 > 10)
            System.out.println(num1 + " 프로그래밍반");
        else
            System.out.println(10 + " 프로그래밍 기초반");


        if (num2 >= 45)
            System.out.println(num2 + " 다른 방과후 수업");
        else if (45 > num2 && num2 > 10)
            System.out.println(num2 + " 프로그래밍반");
        else
            System.out.println(10 + " 프로그래밍 기초반");


        if (num3 >= 45)
            System.out.println(num3 + " 다른 방과후 수업");
        else if (45 > num3 && num3 > 10)
            System.out.println(num3 + " 프로그래밍반");
        else
            System.out.println(10 + " 프로그래밍 기초반");


        if (num4 >= 45)
            System.out.println(num4 + " 다른 방과후 수업");
        else if (45 > num4 && num4 > 10)
            System.out.println(num4 + " 프로그래밍반");
        else
            System.out.println(10 + " 프로그래밍 기초반");

        if (num5 >= 45)
            System.out.println(num5 + " 다른 방과후 수업");
        else if (45 > num5 && num5 > 10)
            System.out.println(num5 + " 프로그래밍반");
        else
            System.out.println(10 + " 프로그래밍 기초반");

    }
}
