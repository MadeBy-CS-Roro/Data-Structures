/**
 * Problem 2: copy Method (Stack ADT)
 * 
 * Description:
 * - Write the recursive static method `copy` that takes two stacks `st1` and `st2` and copies 
 *   all the elements of `st1` into `st2` in the same order while preserving `st1`
 * - You can assume `st2` can hold all `st1` elements
 * - Constraint: You are not allowed to use any auxiliary data structures
 * - Method signature: public static <T> void copy(Stack<T> st1, Stack<T> st2).
 * 
 * Example:
 * Given the stack `st1` (top-to-bottom): 4, 7, 1, 5, 2 and `st2`: Ø. 
 * copy(st1, st2) results in `st2`: 4, 7, 1, 5, 2
 */

public static <T> void copy(Stack<T> st1, Stack<T> st2){
  if(st1.empty())
    return;
  T e = st1.pop;
  copyStack(st1, st2);
  st1.push(e);
  st2.push(e);

}
