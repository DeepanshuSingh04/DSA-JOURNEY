package OneDimensionArray;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];   //creating empty array

        System.out.println("enter array elements");
        for(int i = 0; i<arr.length; i++) {
           arr[i] = sc.nextInt();
        }

        
//first method 
        int max = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max)
              max = arr[i];
        }
        int smax = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]!=max)
                smax = arr[i];
        }
        System.out.println(smax);

        sc.close();
    }
}
