class Solution {
    public int titleToNumber(String columnTitle) {

        int len = columnTitle.length() - 1;

        long sum = 0;
        int count = 0;

        for (int i = len; i >= 0; i--) {
            int c = (int) Math.pow(26, count);
            int d = columnTitle.charAt(i) - 'A' + 1;

            sum += c * d;
            count++;
        }

        return (int) sum;
    }
}
