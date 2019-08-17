class Solution {
    public int[] plusOne(int[] digits) {
        int c9=0;
        for (int i=0;i<digits.length;i++){
            if (digits[i]==9){c9+=1;}
        }
        if(c9==digits.length){
            digits= new int[c9+1];
            digits[0]=1;
            for(int j=1;j<c9+1;j++){
                digits[j]=0;
            }
        }
        else{
       digits[digits.length-1]+=1;
        for(int i=digits.length-1;i>0;i--){
            if (digits[i]==10){digits[i]=0;digits[i-1]+=1;}
        }
        }
        return digits;
    }
}
