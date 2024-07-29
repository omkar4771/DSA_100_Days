// package Day-8_array_1;

public class linearSearch {

    public static int linearSearch(int numbers[],int key){
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == key){
                return 1;
            }
        }
        return -1;
    }
    public static int largestNumber(int numbers[]){
        int large = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(large<numbers[i]){
                large = numbers[i];
            }
        }
        return large;
    }

    public static void main (String args[]){
        int numbers[] = {2, 4, 6, 8 , 10, 12, 14, 16};
        int key = 4;

        int index = linearSearch(numbers, key);
        System.out.println(index);

        int large = largestNumber(numbers);
        System.out.println("large = "+large);
    }
}
