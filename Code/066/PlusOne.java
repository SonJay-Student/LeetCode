public class PlusOne {
    /**
     * Given digits non-empty array of digits representing digits non-negative integer, plus one to the integer.
     * <p>
     * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain digits single digit.
     * <p>
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     * <p>
     * Example 1:
     * <p>
     * Input: [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Example 2:
     * <p>
     * Input: [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     */
    public static void main(String[] args) {

        PlusOne call = new PlusOne();
        System.out.println(call.solution(new int[]{9})[0]);
    }

    private int[] solution(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        for (int j = 0; j < digits.length; j++) {
            newArray[j + 1] = digits[j];
        }
        return newArray;
    }

}
