package OneDimensionArray;

public class Segregate0and1 {
    public static void main(String[] args) {
        // 1 pass solution
        int arr[] = { 0 ,1,1,0,0,1,0};
        int i= 0,j= arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j] == 1) j--;
            //if(i>j) break;
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
        for( i= 0; i<arr.length ; i++)
        System.out.print( arr[i] + " ");
        }
    }
