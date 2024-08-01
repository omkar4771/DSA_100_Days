// package Day-10_sorting_aalgorithms;
public class selectionSort {
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int k=0;k<arr.length;k++){
             System.out.println(arr[k]);
         }
    }
    public static void main(String[] args) {
        int arr [] = {7,8,3,1,2};
        selection(arr);
    }
}
