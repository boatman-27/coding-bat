package Array_2;

import java.util.Arrays;

public class ZeroMax {
    /*
    Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.


zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
     */

    public static void main(String[] args) {
        ZeroMax zeroMax = new ZeroMax();
        System.out.println(Arrays.toString(zeroMax.zeroMax(new int[]{0, 5, 0, 3})));
    }

    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = 0;
                int j = i;
                while (j < nums.length - 1) {
                    if  (nums[j + 1] % 2 != 0) {
                        System.out.println(nums[i + 1]);
                        System.out.println(temp);
                        temp = Math.max(temp, nums[j + 1]);
                        System.out.println("new temp " +temp);

                    }
                    j++;
                }
                nums[i] = temp;
            }
        }
        return nums;
    }
}
