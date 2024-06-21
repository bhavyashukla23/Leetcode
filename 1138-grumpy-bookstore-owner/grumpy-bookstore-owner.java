class Solution {
    public int maxSatisfied(int[] arr, int[] gr, int min) {
        int n = arr.length;
        int sum = 0;

        for(int i=0; i<n; i++){
            if(gr[i]==0) sum+=arr[i];
        }

        // find the maximum loss;
        int loss = 0;
        for(int i=0; i<min; i++){
            if(gr[i]==1) loss+=arr[i];
        }

        int maxLoss = loss;
        int i=0;
        int j=min;
        while(j<n){
            if(gr[i]==1) loss-=arr[i];
            if(gr[j]==1) loss+=arr[j];
            maxLoss = Math.max(maxLoss,loss);
            i++;
            j++;
        }
        return sum+maxLoss;

    }
}