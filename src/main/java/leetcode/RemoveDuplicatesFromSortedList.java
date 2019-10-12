package leetcode;

/**
 * Created by Michael on 19/10/9.
 */
public class RemoveDuplicatesFromSortedList {

    private static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode deleteDuplicates(ListNode head){
        if (head == null) {
            return null;
        }
        ListNode p = head;
        while(p != null && p.next != null){
            if (p.val == p.next.val){
                p.next = p.next.next;
            }else{
                p = p.next;
            }

        }

        return head;
    }

    public static void test1(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        deleteDuplicates(l1);

        printList(l1);
    }

    public static void test2(){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(2);

        l1.next = l2;
        l2.next = l3;

        deleteDuplicates(l1);

        printList(l1);
    }

    public static void test3() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(1);

        l1.next = l2;
        l2.next = l3;

        deleteDuplicates(l1);

        printList(l1);
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        //test1();
        //test2();
        test3();
    }
}
