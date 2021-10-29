class Solution {
   public String longestCommonPrefix(String[] strs) {
if(strs == null || strs.length == 0) return "";
int i =0;
boolean flag = false;
while(i<strs[0].length()){
char c = strs[0].charAt(i);
for(String str : strs){
if(str.length() <= i || c != str.charAt(i)){
flag = true;
break;
}
}
if(flag) break;
i++;
}
return strs[0].substring(0,i);
}
}
