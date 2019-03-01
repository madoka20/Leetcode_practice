package ushio.leetcode.Q13;

/**
 * Solution.java
 * leetcode 013
 * @author Ushio-Cheng
 * @version 1.0
 */
public class Solution {
    public static void main(String[]args){
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));//TEST CASE GOES HERE
    }
    private final char[] ROMAN_CHAR_SET = {'I','V','X','L','C','D','M'};
    private final int[] ROMAN_CHAR_VAL = {1,5,10,50,100,500,1000};
    public int romanToInt(String s) {
        return analysisSubPart(s);
    }
    public int analysisSubPart(String s) {
        int subVal = 0;
        subVal += getValFromRoman(s.charAt(0));
        for (int pointer = 1 ; pointer < s.length() ; pointer++){
            if (romanTblLookup(s.charAt(pointer-1))==romanTblLookup(s.charAt(pointer))){
                subVal += getValFromRoman(s.charAt(pointer));
                continue;
            }
            if (romanTblLookup(s.charAt(pointer-1))<romanTblLookup(s.charAt(pointer))){
                subVal *= -1;
                subVal += getValFromRoman(s.charAt(pointer));
                continue;
            }
            if (romanTblLookup(s.charAt(pointer-1))>romanTblLookup(s.charAt(pointer))){
                subVal += analysisSubPart(s.substring(pointer));
                return subVal;
            }
        }
        return subVal;
    }
    private int romanTblLookup(char c){
        for (int pointer = 0;pointer<ROMAN_CHAR_SET.length;pointer++){
            if (ROMAN_CHAR_SET[pointer]==c){
                return pointer;
            }
        }
        return -1;
    }
    private int getValFromRoman(char c){
        return ROMAN_CHAR_VAL[romanTblLookup(c)];
    }
}
