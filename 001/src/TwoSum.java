import java.util.HashMap;

public class TwoSum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

     You may assume that each input would have exactly one solution, and you may not use the same element twice.

     Example:
     Given nums = [2, 7, 11, 15], target = 9,

     Because nums[0] + nums[1] = 2 + 7 = 9,
     return [0, 1].

     */
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] solution = twoSum.solution(new int[]{2, 7, 11, 15}, 26);
        for (int i = 0; i < solution.length; i++) {
            System.out.println("The index at "+(i+1)+" is "+solution[i]);
        }
    }

    private int[] solution(int[] nums, int target) {
        int [] a ={-1,-1};
        HashMap<Integer,Integer> allNum=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            allNum.put(nums[i],i);
        }
        for(int j=0;j<nums.length;j++){
            if(allNum.get(target-nums[j])!=null&&j!=allNum.get(target-nums[j])){
                return new int[]{j,allNum.get(target-nums[j])};
            }
        }
        return a;
    }
}
