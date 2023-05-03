package tasks;

/**
 * <h2>21. Merge Two Sorted Lists</h2>
 * <p>You are given the heads of two sorted linked lists list1 and list2</p>
 * <p>Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists</p>
 * <p>Return the head of the merged linked list</p>
 * <p>Examples:</p>
 * <p>Input: list1 = [1,2,4], list2 = [1,3,4]<br>Output: [1,1,2,3,4,4]</p>
 * <p>Input: list1 = [], list2 = []<br>Output: []</p>
 * <p>Input: list1 = [], list2 = [0]<br>Output: [0]</p>
 * <br>
 * <p>Constraints:</p>
 * <ul>
 *     <li>The number of nodes in both lists is in the range [0, 50]</li>
 *     <li>-100 <= Node.val <= 100</li>
 *     <li>Both list1 and list2 are sorted in non-decreasing order</li>
 * </ul>
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5, null);

        ListNode ll3 = new ListNode(4, null);
        ListNode ll2 = new ListNode(2,  ll3);
        ListNode ll1 = new ListNode(1, ll2);

        ListNode l = mergeTwoLists(l1, ll1);

        while (l != null) {
            System.out.println(l.val);

            l = l.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dimmy = new ListNode(-1);
        ListNode head = dimmy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                dimmy.next = list1;
                list1 = list1.next;
            } else {
                dimmy.next = list2;
                list2 = list2.next;
            }
            dimmy = dimmy.next;
        }

        if (list1 != null) {
            dimmy.next = list1;
        } else {
            dimmy.next = list2;
        }

        return head.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
