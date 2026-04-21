class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        // for(String str : strs){
        //     if(str.length() < prefix.length()){
        //         prefix = prefix.substring(0, str.length());
        //     }
        // }
        for(String str: strs){
            if(str.length() < prefix.length()){
                prefix = prefix.substring(0, str.length());
            }
            for(int i = prefix.length()-1; i>=0; i--){
                if(prefix.charAt(i) != str.charAt(i)){
                    prefix = prefix.substring(0, i);
                }
            }
        }
        if(prefix.length()>0){
            return prefix;
        }
        return "";
    }
}