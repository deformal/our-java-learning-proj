package testing;
import java.util.*;
public class Helpers {

    public void SayHello(){
        System.out.println("Sup");
    }

    public void Sum(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter first number");
     Integer firstNum = sc.nextInt();
     System.out.println("Please enter second number");
     Integer secondNum = sc.nextInt();
     Integer sum = firstNum + secondNum;
     System.out.println(sum);
     sc.close();
    }

}

