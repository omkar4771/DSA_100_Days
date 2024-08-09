
public class arraySort {
    public static boolean isSorted( int [] arr, int i){
        if(i==arr.length-1){
            return true;
        }
            if (arr[i] <= arr[i+1]){
                isSorted(arr, i+1);
                return true;
            }
            else{
                return false;
            }
    }
    public static void main(String[] args) {
        int arr[] = {5,6};
        int i=0;
        System.out.println(isSorted(arr,i));
    }
}