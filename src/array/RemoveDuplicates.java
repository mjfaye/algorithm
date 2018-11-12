package array;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {3,6,3,8,4,5,5,3,9};

    }

    public void removeDuplicates(int[] nums) {
        int cur = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i-1])
            {
                cur = i;
            }
            else
            {

            }

        }

    }
}
