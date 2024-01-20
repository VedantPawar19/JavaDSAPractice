import java.util.*;

public class ArrayForm {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(num, k).toString());
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        int carry = 0;
        ArrayList<Integer> ansList = new ArrayList<>();

        int index = num.length - 1;

        while (index >= 0 || k > 0 || carry > 0) {
            int x = index >= 0 ? num[index] : 0;
            int y = k % 10;
            int sum = x + y + carry;

            // ansList.add(0, sum % 10); // first adding at last and then reversing in the end will reduce time complexity instead of adding first every time
            ansList.add(sum % 10);

            System.out.println(ansList.toString());
            carry = sum / 10;

            if (index >= 0) {
                index--;
            }

            k /= 10;
        }

        Collections.reverse(ansList);

        return ansList;
    }
}
