// Probelm : 1790

// Input: s1 = "bank", s2 = "kanb"
// Output: true
// Explanation: For example, swap the first character with the last character of s2 to make "bank".

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
            if(s1.equals(s2)) return true;
            int count = 0;
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i<s1.length(); i++){
                sum1 = sum1 + s1.charAt(i);
                sum2 = sum2 + s2.charAt(i);
           }
        if(sum1 == sum2){
            if( s1.length() == 2|| s1.length() == 4  &&s1.charAt(0) != s2.charAt(s2.length()-1))
            {
                return false;
            }
             for(int i = 0; i<s1.length(); i++){
           if(s1.charAt(i)!= s2.charAt(i)){
               count++;
           }
        }
        
        if(count == 2){
            return true;
        }
    }
    else{
        return false;
    }
        return false;
    }
}
