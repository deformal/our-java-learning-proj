package testing;

import java.util.*;

public class Helpers {

    protected void SayHello() {
        System.out.println("Sup");
    }

    protected void Sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        Integer firstNum = sc.nextInt();
        System.out.println("Please enter second number");
        Integer secondNum = sc.nextInt();
        Integer sum = firstNum + secondNum;
        System.out.println(sum);
        sc.close();
    }

    protected void Sub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        Integer firstNum = sc.nextInt();
        System.out.println("Please enter second number");
        Integer secondNum = sc.nextInt();
        Integer sub = firstNum - secondNum;
        System.out.println(sub);
        sc.close();
    }
}