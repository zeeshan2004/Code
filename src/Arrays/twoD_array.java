/*
package Arrays;

import java.util.Scanner;

public class twoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println();
        int cols = sc.nextInt();

        int[][] Array = new int[row][cols];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                Array[row][cols] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {

                System.out.println(Array[row][cols] + " ");
            }
        }
    }
}
*/

package Arrays;

import java.util.Scanner;

public class twoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Declare the 2D array
        int[][] array = new int[row][cols];

        // Input elements into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        // Print the array
        System.out.println("The array is:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        sc.close(); // Close the scanner
    }
}
