class Solution {
    public boolean isPalindrome(int x) {
       int orignal=x;
       int sum=0;
       while(x>0){
        int abc=x%10;
        sum=sum*10+abc;
        x=x/10;
       } 

       if(orignal == sum)
       return true;
       else
       return false;
    }
}