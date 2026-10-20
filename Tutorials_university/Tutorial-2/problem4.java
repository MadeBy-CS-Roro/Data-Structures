/**
 * Problem 4: reverseCopy Method (DoubleLinkedList)
 * 
 * Description:
 * - Write the method `reverseCopy` as a *user* of `DoubleLinkedList`.
 * - The method copies the elements of list l1 into list l2 in *reverse order*.
 * - Constraint: The original list l1 must remain unchanged, and l2 is assumed to be empty.
 * - Signature: public static <T> void reverseCopy(DoubleLinkedList<T> l1, DoubleLinkedList<T> l2).
 * 
 * Example:
 * If l1: A <-> B <-> C <-> D
 * Calling reverseCopy(l1, l2) results in l2: D <-> C <-> B <-> A
 */
public static <T> void reverseCopy(DoubleLinkedList <T> l1,(DoubleLinkedList <T> l2){
    if(l1.empty){
      return;
    }
    l1.findFirst();
    while(!l1.last())
      l1.findNext();
    while(!l1.frist())
      l2.insert(l1.retrieve());
      l1.findPrevious();
  }
  l2.insert(l1.retrieve());
}
      
    
  
