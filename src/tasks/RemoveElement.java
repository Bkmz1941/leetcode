package tasks;

public class RemoveElement {
    public static void main(String[] args) {
        int[] input = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int target = 2;

        removeElement(input, target);

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.gc();
        return j;
    }
}
