package tasks;

public class RemoveDublicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = new int[]{1, 2, 3};

        int k = removeDuplicates(nums);

        assert k == expectedNums.length;
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    public static int removeDuplicates(int[] nums) {
        int idx = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[idx] = nums[i + 1];
                idx++;
            }
        }
        return idx;
    }
}



