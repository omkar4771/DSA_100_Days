// package Day-3_conditional_statement;

import java.util.Scanner;

public class check_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();

        String result = (marks>=33)?"pass":"fail";

        System.out.println("You are "+result);

    }
}
