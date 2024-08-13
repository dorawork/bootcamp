package banking_system2;

import java.nio.channels.SelectableChannel;

public class question16 {

Select PetTpype, count(PetTypeld) as Count
FROM PetTbale p left join PetTypeld pt

}

class Solution {
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;

    while (curr != null) {
        ListNode nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
    }

    return prev;
}
}