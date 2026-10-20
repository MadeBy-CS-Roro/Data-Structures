/**
 * Problem 3: remove Method (Priority Queue ADT)
 * 
 * Description:
 * - Write a static method `remove` that removes every element in the priority queue 
 *   having a priority less than 
 * - Method Signature: public static <T> void remove(PriorityQueue<T> pq, int p)
 * 
 * Example:
 * Given pq: [A, 10], [D, 8], [B, 5], [E, 3], [C, 2]
 * remove(pq, 5) results in pq: [A, 10], [D, 8], [B, 5]
 */
 public static <T> void remove(PriorityQueue<T> pq, int p){

   PQElement <T> element = null;
   PriorityQueue<T> temp = new LinkedPQ<T>;
   
   int count = pq.length();
   for(int i =0; i< count ; i++){
     element = pq.serve();
     if(element.priority>= p)
       temp.enqueue(element.data, element.priority);
   }

   int count2 = temp.length();
   for(int i =0; i<count2; i++){
       element = temp.serve();
       pq.enqueue(element.data, element.priority);
  }
 }
   
     
     
  
    
     
     
   
