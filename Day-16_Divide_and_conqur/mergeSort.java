public class mergeSort {
    public static void merge(int arr[], int si, int mid, int ei){
        int tempArray[] = new int[ei-si+1];
        int i=si; //iterator for left part
        int j=mid +1; //iterator for right part
        int k=0; //iterator for temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                tempArray[k] = arr[i++];
            }else{
                tempArray[k] = arr[j++];
            }
            k++;
        }
        //left part
        while (i<=mid) {
            tempArray[k++] = arr[i++];
        }
        //right part
        while (j<=ei) {
            tempArray[k++]=arr[j++];
        }

        //copy arr
        for(k=0,i=si;k<tempArray.length;k++,i++){
            arr[i]=tempArray[k];
        }

    }

    public static void mergeSort(int arr[], int si, int ei){
        //base case
        if(si>=ei){
            return;
        }
        //find mid
        int mid = (si+ei)/2;

        // sort left
        mergeSort(arr, si, mid);
        //sort right
        mergeSort(arr, mid+1, ei);

        //merge
        merge(arr,si,mid,ei);
    }
public static void main(String[] args) {
    int arr[] = {6,3,9,5,2,8};
    mergeSort(arr,0,arr.length-1);
    for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");    
    }
}
}