class Solution {
    public int trap(int[] height) {
       int i=0, j=height.length-1 , left_max=height[0],  right_max=height[j], sum=0; 
       while(i<j){

        if(left_max <= right_max){
            sum+=(left_max-height[i]);
            i++;
            left_max = Math.max(left_max , height[i]);
        }
        else{
             sum+=(right_max-height[j]);
             j--;
             right_max = Math.max(right_max, height[j]);
        }
       }
       return sum;
    }
}