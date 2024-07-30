public class prefixArray {
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        int prefix[]=new int[arr.length];
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            prefix[i]=sum;
        }
 
        for(int i=0;i<prefix.length;i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
