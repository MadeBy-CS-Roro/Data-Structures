/**
 * Problem 1: split Method (Queue ADT)
 * 
 * Description:
 * - Write a recursive static method `split` that splits a queue of n elements into two queues
 * - Elements with odd orders (1st, 3rd, 5th, ...) are placed in the first queue (oq)
 * - Elements with even orders (2nd, 4th, 6th, ...) are placed in the second queue (eq)
 * - The original queue must remain unchanged at the end of the method
 * - Method Signature: public static <T> void split(Queue<T> q, Queue<T> oq, Queue<T> eq)
 * 
 * Example:
 * Given the queue (A, B, C, D, E), split results in oq (A, C, E) and eq (B, D)
 */
public static void split(Queue<T> q, Queue<T> oq, Queue eq){
  recSplit(q, oq, eq, q.length(), 1);
}

private static <T> void recSplit(Queue<T> q, Queue<T> oq, Queue eq, int count , int pos){
  if(pos> count){
    return;
  }
  T element = q.serve();
  q.enqueue( element);
  if(pos%2 == 1){
    if(!oq.full())
      oq.enqueue(element);
  }else{
      if(!eq.full())
      eq.enqueue(element);
  }
  recSplit(q, oq, eq, count, pos+1);
}
  
