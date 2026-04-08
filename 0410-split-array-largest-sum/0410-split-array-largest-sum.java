class Solution {

    public int countStudents(int[] arr, int pages) {
        int students = 1;
        long pagesStudent = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } 
            else {
                students++;
                pagesStudent = arr[i];
            }
        }

        return students;
    }

    public int splitArray(int[] nums, int k) {

        int low = 0, high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int students = countStudents(nums, mid);

            if (students > k) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return low;
    }
}