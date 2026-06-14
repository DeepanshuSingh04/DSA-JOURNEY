package OneDimensionArray;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a = { 1,20,34,56,67};
        int[] b = {7,12,23,35,55};
        int[] c = new int[a.length+b.length];
        int i = 0, j = 0, k = 0;
        while (i<a.length && j<b.length) {
            if(a[i]<b[j]){
                c[k] = a[i];
                k++;
                i++;
            }
            else{   //b[j] < a[i] 
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i==a.length){
            while(j<b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(j==b.length){
            while(i<a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }
        print(c);         //we make a function because we need to print c evry times
    }
    
    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
