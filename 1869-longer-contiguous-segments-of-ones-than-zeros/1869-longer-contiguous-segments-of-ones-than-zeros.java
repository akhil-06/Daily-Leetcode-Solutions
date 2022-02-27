class Solution {
    //same code can be used in 4-5 problems in leetcode
    //Max consitive ones
    //Max consicutive zeros
    // can be applied to string or array, if binary means only 0 and 1
    public boolean checkZeroOnes(String s) {
        int longestZeros = 0, longestOnes = 0, currentZeros = 0, currentOnes = 0;
	for(int i=0;i<s.length();i++) {
        //when curr0, the make curr1 is 0 and vice versa
		if(s.charAt(i) == '0') {
			longestZeros = Math.max(longestZeros, ++currentZeros);
			currentOnes = 0;
		} else {
			longestOnes = Math.max(longestOnes, ++currentOnes);
			currentZeros = 0;
		}
    }
	return longestOnes > longestZeros;
    }
}