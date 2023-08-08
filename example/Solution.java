package example;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /***
     * 2023.08.03
     * @param nums
     * @param target
     *
     * constrains
     * 2 <= nums.length <= 104 /
     * -109 <= nums[i] <= 109 /
     * -109 <= target <= 109 /
     * Only one valid answer exists.
     * @return returnNumber
     */
    public int[] twoSum(int[] nums, int target) {
//        [3,2,4]
        List<Integer> beforeConvertList = new ArrayList<>();

        int standardNum = 0;
        for(int j = 0; j < nums.length; j++) {
            standardNum = nums[j];
            for(int i = 0; i < nums.length; i++) {
                if(j != i && target == standardNum + nums[i]) {
                    beforeConvertList.add(i);
                }
            }
        }

        int[] ints = beforeConvertList.stream().mapToInt(Integer::intValue).toArray();
        for(int anInt : ints) {
            System.out.println(anInt);
        }

        return beforeConvertList.stream().mapToInt(Integer::intValue).toArray();
    }

}
