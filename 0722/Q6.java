class ListNode {
    int data;
    ListNode next;
    
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Q6 {// 列印整個串列
    public static void printList(ListNode head) {
        // 停止條件：空節點
        if (head == null) {
            return;
        }
        // 處理當前節點，然後遞迴處理下一個
        System.out.print(head.data + " ");
        printList(head.next);
    }
    public static void main(String[] args) {
        // 建立測試串列：1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy, curr = head, temp;
        while(curr != null && curr.next != null) {
            temp = curr.next;
            curr.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        head = dummy.next;

        printList(head);
    }
}
