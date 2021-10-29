class Solution {
    public int findLUSlength(String[] strs) {
        int maxLength = -1;
        for(int i = 0 ; i < strs.length ; i++){
            boolean flag = false;
            int currLength = strs[i].length();
            for(int j = 0 ; j < strs.length ; j++){
                if(i!=j && isSubSeq(strs[i],strs[j])){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                maxLength = Math.max(maxLength,currLength);
        }
        return maxLength;
    }
    public boolean isSubSeq(String a , String b){
        if(a.equals(b)) return true;
        int i = 0 , j = 0;
        while(i< a.length() && j<b.length()){
            if(a.charAt(i)==b.charAt(j++)){
                i++;
            }
        }
        return a.length() ==i;
    }
}
