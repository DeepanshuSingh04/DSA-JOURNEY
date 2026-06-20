package Strings;

public class SumOfAllSubstringsOfANumber {
    public static void main(String[] args) {
        int x = 4532;
        String s = Integer.toString(x);  //converting integer to string
        
        int sum = 0; 
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                System.out.print(s.substring(i,j+1) + " ");

                sum += Integer.parseInt(s.substring(i,j+1));
            }
        }
        System.out.println();
        System.out.println("total sum = " +  sum);
    }
}
