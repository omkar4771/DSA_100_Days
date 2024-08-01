// package Day-10_sorting_aalgorithms;
public class bubbleSort {
    public static void bubbleIncreasing (int arr[]){
        //increasing order 
       for(int turn = 0; turn<arr.length-1;turn ++)
       {
        for(int i=0;i<arr.length-1-turn ;i++)
        {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
     }
        for(int i=0;i<=4;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void bubbleDecreasing (int arr[]){
        for(int turn = 0; turn < arr.length-1;turn ++){
            for(int i=0;i < arr.length-1-turn;i++){
                if(arr[i]<arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        for(int i=0;i<=4;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1};
        bubbleIncreasing(arr);
        bubbleDecreasing(arr);
    }
}
