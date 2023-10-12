public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 88, 95, 99};
        int target = 99;
        System.out.println(BS(arr, target, 0, arr.length - 1));

    }

    public static int BS(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }
        if (arr[m] < target) {
            return BS(arr, target, m + 1, e);
        }
        return BS(arr, target, s, m - 1);
    }
}
