class Solution {
    public int fib(int n) {
        int prev = 0;
        int next = 1;
        int sum = 0;
        if(n==0){
            return 0;
        }else if(n  == 1){
            return 1;
        }else{
            for(int i=1;i<n; i++){
               sum = prev + next;
               prev = next;
               next = sum;
            } 
        }
        return sum;
        
    }
}
// 0 1 1 2 3 5 8 13 21