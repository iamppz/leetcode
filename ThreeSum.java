import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {

  public List<List<Integer>> threeSum(int[] nums) {
    ArrayList<List<Integer>> arrayList = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      int num1 = nums[i];
      if (i > 0 && num1 == nums[i - 1]) {
        continue;
      }
      int left = i + 1;
      int right = nums.length - 1;
      while (left < right) {
        int num2 = nums[left];
        int num3 = nums[right];
        int sum = num1 + num2 + num3;
        if (sum > 0) {
          right--;
        } else if (sum < 0) {
          left++;
        } else {
          List<Integer> list = Arrays.asList(num1, num2, num3);
          arrayList.add(list);
          left++;
          right--;

          while (left < right && nums[left] == nums[left - 1]) {
            left++;
          }
          while (left < right && nums[right] == nums[right + 1]) {
            right--;
          }
        }
      }
    }
    return arrayList;
  }
}
