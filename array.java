
public class array {

    public static void main(String[] args) {
        // 1D array
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2D array
        int nums[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int n[] : nums) {
            for (int r : n) {
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
