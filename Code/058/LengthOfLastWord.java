public class LengthOfLastWord {
    /**
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
     * <p>
     * If the last word does not exist, return 0.
     * <p>
     * Note: A word is defined as a character sequence consists of non-space characters only.
     */
    public static void main(String[] args) {
        String s = new String();
        s="      ";
        LengthOfLastWord call = new LengthOfLastWord();
        System.out.println(call.solution(s));
    }

    private int solution(String s) {
        String[] split = s.split(" ");
        if(s == null||split.length==0){
            return 0;
        }
        return split[split.length-1].length();
    }
}
