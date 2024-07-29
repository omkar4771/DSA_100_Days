// package Day-8_array_1;

public class swapArray {
    public static void swap(int numbers[]){
        int n=numbers.length;
        int r=0,l=n-1;

        while (r<l) {
            int temp = numbers[l];
            numbers[l]=numbers[r];
            numbers[r]=temp;
            
            r++;
            l--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};

        swap(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }

    }
}
