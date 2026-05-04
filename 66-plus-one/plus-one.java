class Solution {
    public int[] plusOne(int[] digits) {
        int [] added;
        if(digits[digits.length-1]==9){
            added = new int[digits.length+1];
        }else{
            added = new int[digits.length];
        }
        int carry=1;
        int addIndex = added.length-1;
        for(int i = digits.length-1 ; i>=0 ; i--){
            System.out.println("i:"+i+"digits[i]" + digits[i]);
            System.out.println("carry:"+carry);
            System.out.println("added[addIndex]"+added[addIndex]);
            added[addIndex] = digits[i] + carry;
            carry =0;
            if(added[addIndex]>9){
                carry = added[addIndex] /10;
                added[addIndex] = added[addIndex] %10;
            }
            addIndex--;
        }
        if(carry != 0){
            added[addIndex] =carry;    
        }else if(added[0] == 0){
            return Arrays.copyOfRange(added, 1, added.length);
        }
        return added;
    }
}