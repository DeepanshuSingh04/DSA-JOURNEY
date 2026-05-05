package OneDimensionArray;

import java.util.Scanner;

public class MinimumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // input
        System.out.print("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // min value finding
        // int min = arr[0];

        int min = Integer.MAX_VALUE; // we can do this question by this also

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);

        sc.close();
    }
    
}
