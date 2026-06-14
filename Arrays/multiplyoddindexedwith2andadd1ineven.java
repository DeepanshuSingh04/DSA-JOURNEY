package OneDimensionArray;

import java.util.Scanner;

public class MultiplyElementQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];  

        //input
        System.out.print("enter array elements");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
         
        //main logic
        for(int i=0; i<arr.length; i++){
          if (i % 2 == 0)
          System.out.println(arr[i] + 10);
          else 
          System.out.println(arr[i] * 2);
        }
       System.out.println();

       sc.close();
    }
}
