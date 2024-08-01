// package Day-10_sorting_aalgorithms;

public class countingSort {
    public static void sortColors(int[] nums){
        int large = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            large = Math.max(large, nums[i]);
        }
        System.out.println("large number : "+large);
        System.out.println(nums[0]);
        //frequency count
        int count[] = new int[large+1];
        for(int i=0;i<count.length;i++){
            count[nums[i]]++;
        }

        // for(int i=0;i<count.length;i++){
        //     System.out.print(count[i]+" ");
        // }

        //sorting
        int j=0;
        for(int i=0;i<nums.length;i++){
            while(count[i]>=0){
                nums[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1};
        sortColors(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}
