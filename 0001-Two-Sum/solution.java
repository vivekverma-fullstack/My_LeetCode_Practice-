class Solution {
    public int reverse(int x) {
    
        int a = 0;
        while(x > 0){
            int digti = x %10;
            a = a * 10 + digti;
             x = x/10;
        }
        return a;
    }
}