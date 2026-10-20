/**
 * Problem 3: search Method (Stack ADT)
 * 
 * Description:
 * - Write the recursive static method `search` that searches for an element `target` in a stack 
 *   `st` and returns true if it's found or false otherwise
 * - Constraint: `st` should not change at the end of the method, and you are not allowed 
 *   to use any auxiliary data structures
 * - Method signature: public static <T> boolean search(Stack<T> st, T target)
 * 
 * Example:
 * Given the stack `st` (top-to-bottom): 5, 7, 5, 3, 2. 
 * search(st, 3) returns true while search(st, 1) returns false
 */
public static <T> boolean search(Stack<T> st, T target){
  if(st.empty())
    return false;

  T e = st.pop();

  boolean found;
  if(e.equals(target))
    found =true;
  else
    found= search(st, target);

  st.push(e);
  return found;
}
