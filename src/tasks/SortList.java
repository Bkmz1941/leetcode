package tasks;

import structures.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Task: 148
 * Input: head = [4,2,1,3]
 * Output: [1,2,3,4]
 */
public class SortList {
    public static void main(String[] args) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(1, node1);
        ListNode node3 = new ListNode(2, node2);
        ListNode node4 = new ListNode(4, node3);
        ListNode head = node4;

        while (head != null) {
            result1.add(head.val);
            head = head.next;
        }

        System.out.println("Unsorted: " + result1.toString());

        head = node4;
        mergeSort(head);

        while (head != null) {
            result2.add(head.val);
            head = head.next;
        }
        System.out.println("Sorted: " + result2.toString());
    }

    private static ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode temp = head;
        ListNode middle = head;
        ListNode ceil = head;

        while (ceil != null && ceil.next != null) {
            temp = middle;
            middle = middle.next;
            ceil = ceil.next.next;
        }

        temp.next = null;

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(middle);

        return merge(left, right);
    }

    private static ListNode merge(ListNode l, ListNode r) {
        ListNode sorted = new ListNode(0);
        ListNode current = sorted;
        while (l != null && r != null) {
            if (l.val < r.val) {
                current.next = l;
                l = l.next;
            } else {
                current.next = r;
                r = r.next;
            }
            current = current.next;
        }
        while (l != null) {
            current.next = l;
            l = l.next;
        }
        while (r != null) {
            current.next = r;
            r = r.next;
        }

        return sorted.next;
    }
}
