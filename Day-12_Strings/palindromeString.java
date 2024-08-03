public class palindromeString {

    public static void main(String[] args) {
        String s = "racecarh";

        for(int i=0;i<(s.length()/2);i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                System.out.println("Given string is not palindrome ");
                break;
            }
        }
        System.out.println("Given string is palindrome ");
    }
}