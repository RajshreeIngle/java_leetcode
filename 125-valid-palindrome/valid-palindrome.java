class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left =0; 
        int right =  s.length()-1;

        while(left<right){
            System.out.println("left index : " +left);
            System.out.println("right index : " +right);
            System.out.println("char at left " + s.charAt(left));
            System.out.println("char at right " + s.charAt(right));           
            if(!(s.charAt(left)>= 48 && s.charAt(left) <=57)){
                if(!(s.charAt(left)>= 97 && s.charAt(left) <=122)){
                    System.out.println("Not a char at left index");
                    left++;
                    continue;
                }
            }
            if(!(s.charAt(right)>= 48 && s.charAt(right) <=57)){
                if(!(s.charAt(right)>= 97 && s.charAt(right) <=122)){
                    System.out.println("Not a char at right index");
                    right--;
                    continue;
                }
            }
            
            if(s.charAt(left) != s.charAt(right)){
                System.out.println("3st if");
                return false;
            }
            
            left++;
            right--;
            
            
        }
        return true;
    }
}