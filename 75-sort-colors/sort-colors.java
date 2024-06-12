class Solution {
    public void sortColors(int[] nums) {
        int zCtr=0, oCtr=0,tCtr=0,ctr=0;
        
        for(int i=0; i<nums.length ; i++){
             if(nums[i] == 0) zCtr++;
             if(nums[i] == 1) oCtr++;
             if(nums[i] == 2) tCtr++;
        }
        for(int i=0 ; i<zCtr; i++){
              nums[ctr] =0;
              ctr++;
        }
        for(int i=0 ; i<oCtr; i++){
              nums[ctr] =1;
              ctr++;
        }
        for(int i=0 ; i<tCtr; i++){
              nums[ctr] =2;
              ctr++;
        }
    }
}