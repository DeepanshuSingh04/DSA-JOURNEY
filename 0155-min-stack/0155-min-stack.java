class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }
    
    public void push(int val) {
        if(st.size()==0) min = (long)val;

        if((long)val >= min) st.push((long)val);
        else{   // stack me fake value daal do
            st.push((long)val + ((long)val-min));
            min = (long)val;
        }
    }
    
    public void pop() {
        if(st.peek() < min){  //locha hain, minimum rollback karo
            min = min + (min - st.peek()); 
        }
        st.pop();
    }
    
    public int top() {
        long a = st.peek();
        if(a < min){  //locha hain, minimum rollback karo
            return (int)min;
        }
        else return (int)a;
    }
    
    public int getMin() {
        return (int)min;
    }
}



// class MinStack {
//     Stack<Integer> st;
//     Stack<Integer> minSt;

//     public MinStack() {
//         st = new Stack<>();
//         minSt = new Stack<>();
//     }
    
//     public void push(int val) {
//          st.push(val);
//          if(minSt.size()==0 || val < minSt.peek())  minSt.push(val);
//          else minSt.push(minSt.peek());
//     }
    
//     public void pop() {
//         st.pop();
//         minSt.pop();
//     }
    
//     public int top() {
//         return st.peek();
//     }
    
//     public int getMin() {
//         return minSt.peek();
//     }
// }




/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */