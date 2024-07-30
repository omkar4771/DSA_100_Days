// package Day-9_array_2;

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

public class container_with_most_water {
    public static void main(String[] args) {
        int heights[] = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;
        for(int i=0;i<heights.length;i++){
            for(int j=1;j<heights.length;j++){

                int h= Math.min(heights[i], heights[j]);
                int w = j-i;

                int area = h*w;
                if(maxArea<area){
                    maxArea= area;
                }
            }
        }
        System.out.println(maxArea);

        int r=heights[0];
        int l=heights[heights.length-1];
        while(r<l){
            // int area=
        }



    }
}
