package leetcode;

public class LinkedListIntersection {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if (headA == null || headB == null) {
            return null;
        }

        int aLength = 0;
        int bLength = 0;

        ListNode aNode = headA;
        ListNode bNode = headB;

        while(aNode != null){
            aLength ++;
            aNode = aNode.next;
        }

        while (bNode != null) {
            bLength ++;
            bNode = bNode.next;
        }

        int diff;

        if (aLength > bLength) {
            aNode = headA;
            diff = aLength - bLength;
            while (diff -- > 0) {
                aNode = aNode.next;
            }
        } else {
            bNode = headB;
            diff = bLength - aLength;
            while (diff -- > 0) {
                bNode = bNode.next;
            }
        }

        bNode = headB;
        aNode = headA;

        while(aNode != null || bNode != null){
            if (aNode != null && bNode != null) {

                if (aNode == bNode) {
                    return aNode;
                } else {
                    aNode = aNode.next;
                    bNode = bNode.next;
                }
            }
        }

        return null;
    }
}
