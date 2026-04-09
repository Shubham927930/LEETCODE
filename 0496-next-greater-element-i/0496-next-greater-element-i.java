class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;

        HashMap<Integer,Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            int ele = nums2[i];

            while(!st.isEmpty() && st.peek()<=ele){
                st.pop();
            }
            if(st.isEmpty()){
                mp.put(nums2[i],-1);
            }
            else{
                mp.put(nums2[i],st.peek());
            }
            st.push(ele);
        }

         int[] nge = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            nge[i] = mp.get(nums1[i]);
        }

        return nge;
    }
}