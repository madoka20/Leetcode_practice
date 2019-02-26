https://leetcode.com/problems/powx-n
class Solution {
    public double myPow(double x, int n) {
        if(n<=-2147483648){
            if(x<1&&x>-1){return 0;}
            if(x>1||x<-1){return 0;}
            
            return 1;}
        if(n>=2147483647){
            if(x<1&&x>-1){return 0;}
            if(x>1||x<-1){return 0;}
           if(x==1){return 1;}
            if(x==-1){return -1;}}
        double re=1;
        if(n!=0){
            for(int i=0; i<Math.abs(n);i++){
                re*=Math.abs(x);
            }
            
            
            if(n<0){re=1/re;}
            if(x<0&&n%2==1){re=re*-1;}
            return re;
        }    
            
       return 1; 
    }
}
