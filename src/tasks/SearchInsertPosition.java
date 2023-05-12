package tasks;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert(nums, 4));
    }

    public static int searchInsert(int[] nums, int target) {
        int min = 0; int max = nums.length - 1;

        while (min <= max) {
            int mid = (max + min) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return min;
    }
}
