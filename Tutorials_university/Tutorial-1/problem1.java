/**
 * Problem 1: Generic Search and Condition Implementation
 * 
 * Description:
 * 1. Complete the generic method `search` in the `Utils` class that takes a generic array 
 *    `data` of size `n` and a `Condition<T>` interface. It returns the index of the first 
 *    element that satisfies the condition (i.e., cond.test(data[i]) returns true), or -1 if not found.
 * 
 * 2. Using the `search` method above, implement the `searchEven` method (along with its 
 *    appropriate Condition implementation) to find the first even number in an array of integers.
 */
public interface Condition<T>{
  boolean test(T data);
}

public class Uitls{
  public static <T> int seach ( T[] data, int n, Condition <T> cond) {
    for(int i=0; i<n ; i++){
      if(cond.test(data[i]))
        ruturn i;
    }
    ruturn -1;
  }
}
    
    
