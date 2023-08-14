package example;

import example.vo.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /***
     * 2023.08.03 - 2023.08.08
     * @param nums
     * @param target
     * constrains
     * 2 <= nums.length; <= 104 /
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


    /***
     * 2023-08-14 (Mon)
     * @return boolean
     */
    public boolean isPalindrome(int x) {

        String v = String.valueOf(x);
        char[] forward = new char[v.length()];
        char[] backward = new char[v.length()];
        boolean result = false;

        for(int i = 0; i < v.length(); i++) {
            forward[i] = v.charAt(i);
        }

        int j = 0;
        for(int i = v.length() - 1; i >= 0; i--) {
            backward[j] = v.charAt(i);
            j++;
        }

        ArrayList<Boolean> resultArray = new ArrayList<>();
        for(int i = 0; i < v.length(); i++) {
            if(forward[i] == backward[i]) {
                resultArray.add(true);
            } else {
                resultArray.add(false);
            }
        }

        boolean contains = resultArray.contains(false);
        if(Boolean.FALSE.equals(contains)) {
            result = true;
        }

        return result;
    }


    /***
     * 2023-08-14 (Mon)
     * @return boolean
     */
    public boolean isPalindromeBestSolutions(int x) {

        if(x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while(temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        System.out.println("(reversed == x)");
        System.out.println((reversed == x));

        return (reversed == x);

    }

    /***
     * 2023-08-14 (Mon)
     * @param s
     * @return
     */
    public int romanToInt(String s) {

        int result = 0;
        char[] charArray = s.toCharArray();
        for(char c : charArray) {
            result += this.convertTo(c);
        }

        int subResult = 0;
        for(int i = 0; i < charArray.length; i++) {
            if(i != charArray.length - 1) {
                char c = charArray[i];
                char v = charArray[i + 1];
                if(c == 'I' && v == 'V' || c == 'I' && v == 'X') {
                    subResult += this.convertTo(c) * 2;
                } else if(c == 'X' && v == 'L' || c == 'X' && v == 'C') {
                    subResult += this.convertTo(c) * 2;
                } else if(c == 'C' && v == 'D' || c == 'C' && v == 'M') {
                    subResult += this.convertTo(c) * 2;
                }
            }
        }

        return result - subResult;
    }

    private int convertTo(int c) {
        return switch(c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    /***
     *
     * @param l1, l2
     * constrains
     * The number of nodes in each linked list is in the range [1, 100].
     * 0 <= Node.val <= 9
     * It is guaranteed that the list represents a number that does not have leading zeros.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        return new ListNode();
    }


}
