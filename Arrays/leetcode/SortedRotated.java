//Check if array is sorted and rotated
class Solution {
    public boolean check(int[] nums) {
        //keep count of no. of times arr is unsorted
        int check = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                check++;
            }
        }
        // if arr is rotatied and sorted check <= 1
        if (check > 1) {
            return false;
        }
        return true;
    }
}

class SortedAndRotated {
    public static void main(String[] args) {
        int[] nums = { 2, 1, 3, 4 };
       //[3,4,5,1,2]
       //[1,2,3]
        Solution s = new Solution();
        System.out.println(s.check(nums));
    }
}