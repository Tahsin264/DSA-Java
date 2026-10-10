
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;

        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;
            int sum = -1 * arr[i];

            while (left < right) {
                int s = arr[left] + arr[right];

                if (s == sum) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(arr[i]);
                    triplet.add(arr[left]);
                    triplet.add(arr[right]);

                    result.add(triplet);

                    left++;
                    right--;

                    // Avoid duplicate elements
                    while (left < right &&
                           arr[left] == arr[left - 1]) {
                        left++;
                    }

                    while (left < right &&
                           arr[right] == arr[right + 1]) {
                        right--;
                    }
                }
                else if (s < sum) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }
}
