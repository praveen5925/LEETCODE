class Solution {
    public int largestInteger(int[] nums, int k) {

        int answer = -1;
        for (int x = 0; x <= 50; x++) {
         int count = 0;
        for (int s = 0; s <= nums.length - k; s++) {

                boolean found = false;

                for (int j = s; j < s + k; j++) {

                    if (nums[j] == x) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    count++;
                }
            }

            if (count == 1) {
                answer = x;
            }
        }

        return answer;
    }
}