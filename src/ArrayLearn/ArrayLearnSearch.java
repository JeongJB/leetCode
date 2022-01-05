package ArrayLearn;

public class ArrayLearnSearch {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validMountainArray(int[] arr) {
        int i;
        int ptr = 0;
        boolean idxInc = false;
        boolean idxDec = false;

        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                break;
            }
            else {
                idxInc = true;
            }
        }
        for (; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                break;
            }
            else {
                idxDec = true;
            }
        }

        return (idxInc && idxDec && i == arr.length - 1);
    }
}
