package ArrayLearn;

import java.util.List;

public class ArrayLearnMain {
    public static void main(String[] args) {
        ArrayLearnConclusion arrayLearn = new ArrayLearnConclusion();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res = arrayLearn.findDisappearedNumbers(nums);
        for (int num : res) {
            System.out.println(num);
        }
    }
}