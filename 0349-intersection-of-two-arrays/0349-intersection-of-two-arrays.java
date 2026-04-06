class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st1 = new HashSet<>();
        HashSet<Integer> st2 = new HashSet<>();
        HashSet<Integer> st3 = new HashSet<>();

        for(int i : nums1){
            st1.add(i);
        }

        for(int i:nums2){
            st2.add(i);
        }

        for(int i : st1){
            if(st2.contains(i)){
                st3.add(i);
            }
        }
         int[] ans = new int[st3.size()];
        int idx = 0;
        for(int i:st3){
            ans[idx++] = i;
        }
        return ans;
    }
}