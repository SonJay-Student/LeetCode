public class RemoveDuplicatesFromSortedList {
    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     * <p>
     * Example 1:
     * <p>
     * Input: 1->1->2
     * Output: 1->2
     * Example 2:
     * <p>
     * Input: 1->1->2->3->3
     * Output: 1->2->3
     */
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList call = new RemoveDuplicatesFromSortedList();
        ListNode node = new ListNode(1);
        node.next = new ListNode(1);
        node.next.next = new ListNode(2);
        call.solution(node);
        System.out.println(node.toString());

    }

    private ListNode solution(ListNode head) {
        if (head == null) return head;
        ListNode middle = head;
        ListNode result = head;
        head = head.next;
        while (head != null) {
            if (head.val == middle.val) {
                middle.next = null;
            } else {
                middle.next = head;
                middle = head;
            }
            head = head.next;
        }
        return result;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuffer sbf = new StringBuffer();
            sbf.append(val);
            while (next != null) {
                sbf.append(">" + next.val);
                next = next.next;
            }
            return sbf.toString();
        }
    }
}
