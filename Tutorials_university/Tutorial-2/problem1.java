/**
* Problem 1:
 * - Implement the `reverse()` method as an implementer of the LinkedList ADT
 * - Implement the `reverse()` method as a user of the List ADT
 *
*/

public void reverse (){
  if (head == null || head.next == null)
    return;
  Node <T> previous = null;
  Node <T> current = head;
  Node <T> next = null;

  whlie(current != null){
    next = current.next;
    current.next=previous; //reverse pointer direction
    previous =current;
    current = next;
  }
   head = previous;
}

