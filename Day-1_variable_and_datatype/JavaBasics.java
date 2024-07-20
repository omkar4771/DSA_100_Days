import java.util.*;

public class JavaBasics
{   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 20; 
        int sum = a+b;
        System.out.println("Sum = "+sum);

        String name = "omkar";
        System.out.println(name);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Sum = "+(num1+num2));

        //area of circle

        float pi = 3.14f;
        float radius = sc.nextInt();
        float area = pi *radius*radius;
        System.out.println(area);
    }
}
