/**
* Problem 1:
 * 1- Implement the `reverse()` method as an implementer of the LinkedList ADT
 * 2- Implement the `reverse()` method as a user of the List ADT
 *
*/

//1
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

//2
public static <T> void reverse(List <T> list){
  if(list.empty())
    return;
  
  list.findFrist();
  int count= 1
    
  whlie(!list.last()){
    count++;
    list.findNext();
  }

  if(count == 1){
    return;
  }

  list.findFrist();
  //left and right are type T because we are swapping element data, not the node references themselves
  T left = null;
  t right = null;

  for(int i =0; i <(count/2); i++){
    left = list.retrieve();
    for(int j = i; j < count -i -1; i++)
      list.findNext();

  right = list.retrive();
  list.update(left); //swap
  list.findFrist();

  for(int j =0; j<i; i++)
    list.findNext();

  list.update(right); //swap
  list.findNext();
  }
}
    
  

