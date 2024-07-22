// package Day-3_conditional_statement;
//Writea Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class ckeck_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        String result = (num<=-1)?"negative":"positive";
        System.out.println(result);
    }
}
