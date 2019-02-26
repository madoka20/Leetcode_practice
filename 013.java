//https://leetcode.com/problems/roman-to-integer/
//LeetCode Problem13 Roman to integer
class Solution {
    public int romanToInt(String s) {
        int num=0;
        char[] roman={'M','D','C','L','X','V','I'};
        char[] c=s.toCharArray();
        
        for(int i=0;i<c.length-1;i++){
            if (c[i]==roman[0]){
                num+=1000;
            }
            if(c[i]==roman[1]){
                num+=500;
            }
            if(c[i]==roman[3]){
                num+=50;
            }
              if(c[i]==roman[5]){
                num+=5;
            }
            if((c[i]==roman[6]&&(c[i+1]==roman[5]||c[i+1]==roman[4]))){
                num-=1;
            }
            if((c[i]==roman[4]&&(c[i+1]==roman[2]||c[i+1]==roman[3]))){
                num-=10;
            }
            if((c[i]==roman[2]&&(c[i+1]==roman[0]||c[i+1]==roman[1]))){
                num-=100;
            }
            if((c[i]==roman[6]&&(c[i+1]!=roman[5]&&c[i+1]!=roman[4]))){
                num+=1;
            }
            if((c[i]==roman[4]&&(c[i+1]!=roman[2]&&c[i+1]!=roman[3]))){
                num+=10;
            }
            if((c[i]==roman[2]&&(c[i+1]!=roman[0]&&c[i+1]!=roman[1]))){
                num+=100;
            }
            
            }
        if(c[c.length-1]=='M'){num+=1000;}
        if(c[c.length-1]=='D'){num+=500;}
        if(c[c.length-1]=='C'){num+=100;}
        if(c[c.length-1]=='L'){num+=50;}if(c[c.length-1]=='V'){num+=5;}
        if(c[c.length-1]=='X'){num+=10;}if(c[c.length-1]=='I'){num+=1;}
        return num;
        
    }
}
