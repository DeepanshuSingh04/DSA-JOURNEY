package TwoDimensionalArray;

import java.util.Scanner;
public class BasicsOf2dArray {
    public static void main(String[] args) {
        //intialisation
        // int[][] arr = new int[4][3];

        // //output
        // for(int i=0; i<4; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();  //har inner loop means columns ke bdd enter agle line me le jaega for new row

             
        //second way of intialisation
        // int[][] arr = {{3,4,6,5},{5,7,9,8},{1,2,0,4}};

        // //output
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<4; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();  //har inner loop means columns ke bdd enter agle line me le jaega for new row


        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int m = sc.nextInt();
        System.out.println("enter columns");
        int n = sc.nextInt();   
        int[][] arr = new int[m][n];
        System.out.println("enter array elements");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();       //taki i/p or o/p ke beechh me gap ho
        // output
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
