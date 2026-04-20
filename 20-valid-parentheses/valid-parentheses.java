class Solution {
    public boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        for(int i = 0; i<s.length() ; i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{' ){
                a.push(s.charAt(i));
            }else{
                if(s.charAt(i) == ')' && !a.empty() && a.peek() == '('){
                    a.pop();
                    // continue;
                }else if(s.charAt(i) == ']'  && !a.empty() && a.peek() == '['){
                    a.pop();
                    // continue;
                }else if(s.charAt(i) == '}' && !a.empty() && a.peek() == '{'){
                    a.pop();
                    // continue;
                }else{
                    return false;
                }
            }     
        }
        if(a.empty()){
            return true;
        }
        return false;
    }
}