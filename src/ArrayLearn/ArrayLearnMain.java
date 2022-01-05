package ArrayLearn;

public class ArrayLearnMain {
    public static void main(String[] args) {
        ArrayLearnInPlace arrayLearn = new ArrayLearnInPlace();
        int[] nums = {0};
        int[] res = arrayLearn.sortArrayByParity(nums);
        for (int num : res) {
            System.out.println(num);
        }
    }
}