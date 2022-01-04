
public class ArrayLearnMain {
    public static void main(String[] args) {
        ArrayLearnInPlace arrayLearn = new ArrayLearnInPlace();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int res = arrayLearn.removeDuplicates(nums);
        for (int num : nums) {
            System.out.println(num);
        }
        System.out.println("결과 : " + res);
    }
}