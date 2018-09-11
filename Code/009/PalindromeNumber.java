public class PalindromeNumber {
    /**
     * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
     * <p>
     * Example 1:
     * <p>
     * Input: 121
     * Output: true
     * Example 2:
     * <p>
     * Input: -121
     * Output: false
     * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
     * Example 3:
     * <p>
     * Input: 10
     * Output: false
     * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
     * Follow up:
     * <p>
     * Coud you solve it without converting the integer to a string?
     */
    public static void main(String[] args) {
        PalindromeNumber call = new PalindromeNumber();
        System.out.println(call.solution(123));
        System.out.println(call.solution(121));
    }

    public boolean solution(int x) {
        if (x == 0) return Boolean.TRUE;
        if (x < 0 || x % 10 == 0) return Boolean.FALSE;
        int last = x % 10;
        x /= 10;
        while (last < x) {
            last = last * 10 + x % 10;
            x /= 10;
        }
        if (last == x || last / 10 == x) return Boolean.TRUE;
        return Boolean.FALSE;
    }
}
