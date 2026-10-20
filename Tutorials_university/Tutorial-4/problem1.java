/**
 * Problem 1: replace Method (Stack ADT)
 * 
 * Description:
 * - Write the static method `replace`, user of Stack ADT, that takes as input a stack `st` 
 *   and two elements `e1` and `e2`.
 * - It replaces all the occurrences of the element `e1` in `st` with `e2`.
 * - Method signature: public static <T> void replace(Stack<T> st, T e1, T e2).
 * 
 * Example:
 * Given the stack `st` (top-to-bottom): 5, 7, 5, 3, 2. 
 * replace(st, 5, 0) results in: 0, 7, 0, 3, 2.
 */
public static <T> void replace(Stack<T> st, T e1, T e2){
  Stack <T> tmp = new LinkedStack<T>();
  T e = null;
  while(!st.empty()){
    e = st.pop();
    if(e.equals(e1))
      e= e2;
    tmp.push(e);
  }
  while(!tmp.empty())
    st.push(tmp.pop());
}


