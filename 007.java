//https://leetcode.com/problems/reverse-integer/
//problem 7
class Solution {
    public int reverse(int x) {
        
      long n=0;
        while(x!=0){
           n=n*10+x%10;
            x/=10;}
           if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
            return 0;}
        else{return (int)n;}
    }
}
