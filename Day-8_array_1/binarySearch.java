// package Day-8_array_1;

public class binarySearch {
    public static int binary(int numbers[],int key){
        int n=numbers.length;
        int l=0, r=n-1;
        while (l<=r) {
            int m=(l+r)/2;
            if(numbers[m]==key){
                return m;
            }
            if(numbers[m]>key){
                r=m-1;
            }
            else if(numbers[m]<key) {
                l=m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14};
        int key = 4;
        System.out.println(binary(numbers, key));

    }
}
