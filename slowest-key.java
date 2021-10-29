class Solution {
    public char slowestKey(int[] releasesTimes, String keysPressed) {
        for(int i = releasesTimes.length-1 ; i >=1 ; i--){
            releasesTimes[i] -= releasesTimes[i-1];
        }
        
        int maxi = 0;
        char max_char = keysPressed.charAt(0);
        for(int i = 0 ; i <= releasesTimes.length-1 ; i++){
            if(maxi < releasesTimes[i])
            {
                maxi = releasesTimes[i];
                max_char = keysPressed.charAt(i);
            }
            
            if(maxi == releasesTimes[i]){
                if(max_char < keysPressed.charAt(i))
                    max_char = keysPressed.charAt(i);
            }
        }
        return max_char;
    }
    
}
