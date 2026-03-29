import java.util.Scanner;
public class multi_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("enter the number of columns");
        int cols = sc.nextInt();
        System.out.println("enter the number of kuch bhi");
        int kuch_bhi = sc.nextInt();
        int arr[][][] = new int[rows][cols][kuch_bhi];
        System.out.println("enter the elements of the array");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                for(int k = 0; k < kuch_bhi; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }  // i can use as much dimensioanl arrays as i want, like in this i've used covered 3 dimensional array
        System.out.println("the elements of the array are:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                for(int k = 0; k < kuch_bhi; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
            }
            System.out.println();
        }
    }
}
