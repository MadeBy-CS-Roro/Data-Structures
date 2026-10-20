/**
 * Problem 2: merge Method (Priority Queue ADT)
 * 
 * Description:
 * - Write a static method `merge` that merges two priority queues (pq1 and pq2) into one priority queue (mq)
 * - Assume mq is initially empty
 * - Method Signature: public static <T> void merge(PriorityQueue<T> mq, PriorityQueue<T> pq1, PriorityQueue<T> pq2)
 * 
 * Example:
 * Given pq1: [A, 10], [B, 5], [C, 2] and pq2: [D, 8], [E, 3]
 * Merge results in mq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2]
 
 */
 public static <T> void merge(PriorityQueue<T> mq, PriorityQueue<T> pq1, PriorityQueue<T> pq2){
  PQElement <T> element =null;
   
  int count1 = pq1.length();
  
   for(int i =0 i< count1; i++){
      element = pq1.serve();
     if(!mg.full())
       mg.enqueue(element.data, element.priority);
   }

  int count2 = pq1.length();
  
   for(int i =0 i< count2; i++){
      element = pq2.serve();
     if(!mg.full())
       mg.enqueue(element.data, element.priority);
   }
   
 }
