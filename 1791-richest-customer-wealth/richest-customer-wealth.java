class Solution {
    public int maximumWealth(int[][] accounts) {
    int maxwealth = 0;
        for(int r=0 ; r<accounts.length; r++){
            int sum = 0;
            for(int c=0 ; c<accounts[r].length; c++){
                sum += accounts[r][c];
                if(sum >maxwealth){
                    maxwealth = sum;
                }

                
            }
        }
        return maxwealth;
        
        
    }
}