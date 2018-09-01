public class ReverseInteger {
    /**
     * Given a 32-bit signed integer, reverse digits of an integer.
     * <p>
     * Example 1:
     * <p>
     * Input: 123
     * Output: 321
     * Example 2:
     * <p>
     * Input: -123
     * Output: -321
     * Example 3:
     * <p>
     * Input: 120
     * Output: 21
     * Note:
     * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     */
    public static void main(String[] args) {
        int y = Integer.MIN_VALUE;
        System.out.println(y);
        ReverseInteger call = new ReverseInteger();
        System.out.println(call.solution(y));
    }

    private int solution(int x) {
        int result = 0;
        int pop = 0;
        while (x != 0) {
            pop = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || result * 10 == Integer.MAX_VALUE && pop > 7) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || result * 10 == Integer.MIN_VALUE && pop < -8) {
                return 0;
            }
            result = result * 10 + pop;
        }
        return result;
    }
}
