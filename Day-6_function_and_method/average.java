public class average {
    public static int avg(int a,int b, int c){
       int  answer = (a+b+c)/3;
       return answer;
    }

    public static void main(String[] args) {
        int a=10,b=20,c=30;

        System.out.println(avg(a,b,c));

    }
}