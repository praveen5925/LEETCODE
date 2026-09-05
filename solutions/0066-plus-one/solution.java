class Solution {
    public int[] plusOne(int[] digit) {

        int n = digit.length;

        for (int i = n - 1; i >= 0; i--) {

            if (digit[i] == 9) {
                digit[i] = 0;
            } 
            else {
                digit[i] += 1;
                return digit;
            }
        }

        
        int[] result = new int[n + 1];
        result[0] = 1;

        return result;
    }
}
