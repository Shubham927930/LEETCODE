class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = n;
        int close = n;
        solve(open,close,"",ans);
        return ans;
    }
    public void solve(int open,int close, String output, List<String> ans){
        if(open ==0 && close ==0){
            ans.add(output);
            return;
        }
        if(open!=0){
            solve(open-1,close,output+"(",ans);
        }
        if(close>open){
            solve(open,close-1,output+")",ans);
        }
    }
}