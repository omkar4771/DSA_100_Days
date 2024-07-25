public class palindrome_num {
    public static void palindrome(int num){
        int num1 = num;
        int num2 = num;
        int num3;
        for (int i=0;i<=3;i++)
        {
            num3 = num2 % 10;
            num2 = num2/10;

            if(num1 == num3){
                System.out.println("palindrome number");
            }
        }   
    }
    public static void main(String[] args) {
        int num = 121;

        palindrome(num);


    }
}
