package leetcode;

public class AddTwoNumbers {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if (l1 == null && l2 != null) {
            return l2;
        }

        if (l1 != null && l2 == null) {
            return l1;
        }

        int carryOn = 0;
        ListNode newHead = null;
        ListNode currentNewNode = null;
        boolean firstTime = true;

        while(l1 != null && l2 != null){
            int newVal = l1.val + l2.val + carryOn;

            if (newVal >= 10) {
                newVal = newVal % 10;
                carryOn = 1;
            } else {
                carryOn = 0;
            }
            if (firstTime) {
                newHead = new ListNode(newVal);
                currentNewNode = newHead;
                firstTime = false;
            }else{
                currentNewNode.next = new ListNode(newVal);
                currentNewNode = currentNewNode.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int newVal = l1.val + carryOn;
            if (newVal >= 10) {
                newVal = newVal % 10;
                carryOn = 1;
            } else {
                carryOn = 0;
            }

            currentNewNode.next = new ListNode(newVal);
            currentNewNode = currentNewNode.next;
            l1 = l1.next;
        }

        while(l2 != null){
            int newVal = l2.val + carryOn;
            if (newVal >= 10) {
                newVal = newVal % 10;
                carryOn = 1;
            } else {
                carryOn = 0;
            }

            currentNewNode.next = new ListNode(newVal);
            currentNewNode = currentNewNode.next;
            l2 = l2.next;
        }

        if (carryOn > 0) {
            currentNewNode.next = new ListNode(carryOn);
        }

        return newHead;
    }

    public static void test1(){
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode ll1 = new ListNode(5);
        ListNode ll2 = new ListNode(6);
        ListNode ll3 = new ListNode(4);

        ll1.next = ll2;
        ll2.next = ll3;

        printLinkedList(addTwoNumbers(l1, ll1));
    }

    private static void test2() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;

        ListNode ll1 = new ListNode(5);
        ListNode ll2 = new ListNode(6);
        ListNode ll3 = new ListNode(4);
        ListNode ll4 = new ListNode(8);

        ll1.next = ll2;
        ll2.next = ll3;
        ll3.next = ll4;

        printLinkedList(addTwoNumbers(l1, ll1));
    }

    private static void test3(){
        ListNode ll1 = new ListNode(5);
        ListNode ll2 = new ListNode(5);

        printLinkedList(addTwoNumbers(ll1, ll2));
    }

    private static void test4(){
        ListNode l1 = new ListNode(9);
        ListNode l2 =new ListNode(8);

        ListNode ll1 = new ListNode(1);

        l1.next = l2;

        printLinkedList(addTwoNumbers(l1, ll1));
    }

    private static void test5(){
        ListNode l1 = new ListNode(1);

        ListNode ll1 = new ListNode(9);
        ListNode ll2 = new ListNode(9);

        ll1.next = ll2;

        printLinkedList(addTwoNumbers(l1, ll1));
    }

    private static void printLinkedList(ListNode l){
        while(l != null){
            System.out.print(l.val + " ");
            l = l.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
//        test4();
        test5();
    }
}
