public class firstOccurence {
    public static int firstOcc(int arr[], int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i=0;
        int key = 5;
        System.out.println(firstOcc(arr,key,i));
    }
}