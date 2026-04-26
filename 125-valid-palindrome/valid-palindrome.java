class Solution {
    public boolean isPalindrome(String s) {
        
        String s2="";
        boolean isPal = false;
        for(int i=0; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(((int)ch >= 48 && (int)ch <=57) || ((int)ch >= 65 && (int)ch <=90) || ((int)ch >= 97 && (int)ch <=122)){
                s2 = s2.concat(s.valueOf(ch));
            }
        }
        s2 = s2.toLowerCase();
        System.out.println(s2);
        int len = s2.length();
        int mid = 0;
        if(len%2==0){
            mid = (len/2)-1;
        }else{
            mid = (len/2);
        }

        for(int i =0; i<=mid ; i++){
        	System.out.println(i + " " +(len-i-1) );
        	System.out.println(s2.charAt(i));
        	System.out.println(s2.charAt(len-i-1));
            if(s2.charAt(i)==(s2.charAt(len-i-1))){
                isPal = true;
                continue;
            }
            else{
                isPal = false;
                break;
            }
        }
        if(s2.isEmpty()) {
			return true;
		}

        
        // System.out.println(isPal);
       return isPal;
        
    }
}