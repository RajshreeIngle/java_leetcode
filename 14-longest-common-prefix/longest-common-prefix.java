class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int n = strs.length;
        int smallestString = prefix.length();
        // for(int i =1; i<n ;i++){
        //     if(strs[i] != prefix){
        //         System.out.println("reducing one char");
        //         char [] ch = new char[prefix.length()-1];
        //         prefix.getChars(0,(prefix.length()-1), ch,0);
        //         prefix = String.valueOf(ch);
        //         System.out.println(prefix);
        //     }
        //     // System.out.println("no");
        // }
        for(String str : strs){
            if(str.length() < prefix.length()){
                prefix = prefix.substring(0, str.length());
            }
        }
        for(String str: strs){
            System.out.println(prefix);
            System.out.println(str);
            for(int i = prefix.length()-1; i>=0; i--){
                System.out.println(prefix.charAt(i));
                System.out.println(str.charAt(i));
                if(prefix.charAt(i) != str.charAt(i)){
                    prefix = prefix.substring(0, i);
                }
            }
        }
        System.out.println(prefix);
        if(prefix.length()>0){
            return prefix;
        }
        return "";
    }
}