public class lastOccurence {

    public static int lastOcc(int arr[], int key , int i){
        
        if(i==arr.length){
            return -1;
        }
        int isfound = lastOcc(arr, key, i+1);
        if(isfound == -1 && arr[i]==key){
            return i;
        }
        return isfound;
        
        
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int i=0;
        int key = 5;
        System.out.println(lastOcc(arr, key, i));
    }
}