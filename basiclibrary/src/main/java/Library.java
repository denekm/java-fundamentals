import java.util.Arrays;

public class Library {

    public static int[] roll(int x) {
        int[] result = new int[x];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 6) + 1;;
        }
        return result;
    }
    public static boolean containsDuplicates(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(roll(4)));

        int [] nums = {2,45,9,6};
        System.out.println(containsDuplicates(nums));
    }
}
