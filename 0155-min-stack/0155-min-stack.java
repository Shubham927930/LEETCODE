class Pair{
    int ele;
    int min;
    Pair(int ele,int min){
        this.ele = ele;
        this.min = min;
    }
}
class MinStack {


     Stack<Pair> st;
    public MinStack() {
       st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new Pair(val,val));
            return;
        }
        int newMin = Math.min(val,st.peek().min);
        st.push(new Pair(val,newMin));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().ele;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */