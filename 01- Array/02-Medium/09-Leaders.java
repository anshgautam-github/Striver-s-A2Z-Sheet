import java.util.*;

public class Main {
    public static List<Integer> findLeaders(int[] arr, int n) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Reverse the list since we collected leaders from right to left
        Collections.reverse(leaders);

        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        List<Integer> leaders = findLeaders(arr, n);

        System.out.println("Leaders: " + leaders);
    }
}
