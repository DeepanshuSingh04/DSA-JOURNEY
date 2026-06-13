package OneDimensionArray;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr = {8,9,10,12,34,56};
            for(int i=1;i<arr.length;i+=2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        }
    }
}
