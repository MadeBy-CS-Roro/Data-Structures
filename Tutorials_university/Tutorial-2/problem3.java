/**
 * Problem 3: removeBetween Method (DoubleLinkedList)
 * 
 * Description:
 * - Write the method `removeBetween` as a member of the `DoubleLinkedList` class[cite: 4].
 * - The method takes two elements e1 and e2, and removes all elements located *between* them 
 *   (note that e1 and e2 themselves are *not* removed)[cite: 4].
 * - If e1 or e2 (or both) do not exist, or if no elements are between them, no element is removed[cite: 4].
 * - Assumptions: Elements are unique, and e1 != e2[cite: 4].
 * - Constraint: Do not call any methods and do not use any auxiliary data structures[cite: 4].
 * - Signature: public void removeBetween(T e1, T e2)[cite: 4].
 * 
 * Example:
 * Given list: A <-> B <-> C <-> D <-> E <-> F
 * removeBetween('B', 'E') results in: A <-> B <-> E <-> F[cite: 4]
 */

public void removeBetwaan( T e1, T e2){
  if(head == null || head.next == null){
    return;
  }

Node<T> p = head;  
while(p.next != null){
  if(p.data.equals(e1)){
      Node<T> q = p.next();
      while(q.next != null){
        if(q.data.equals(e2)){
        p.next =q;
        q.previous =p;
        }
        q=q.next();
      }
      break;
    }
  p =p.next;
 }
}
  
  
