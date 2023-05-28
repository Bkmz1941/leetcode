package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class PlusOne {
    public static void main(String[] args) {
        int[] input = new int[]{9, 9};
        System.out.println(Arrays.toString(plusOne(input)));
    }

    private static int[] plusOne(int[] digits) {
        int[] result = new int[digits.length];

        for (int i = digits.length - 1; i >= 0; i--) {
            result[i] += digits[i];
            if (i == digits.length - 1) result[i]++;

            if (i == 0 && result[i] > 9) {
                result = new int[digits.length + 1];
                int j = result.length - 1;
                while (j != 0) {
                    result[j] = 0;
                    j--;
                }
                result[j] = 1;
            }

            if (result[i] > 9) {
                result[i] = 0;
                result[i - 1]++;
            }
        }

        return result;
    }
}
