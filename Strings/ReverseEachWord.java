package Strings;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        String s = "satyam and harsh sleep in class";
        StringBuilder sb = new StringBuilder(s);
        sb.append(' ');
        int i = 0 , j = 0;
        while(j<sb.length()){
            // if(sb.charAt(j) != ' '){
            //     j++;
            // }
            // else{
            //     //reverse i to j-1 part of sb
            //     reversePart(sb,i,j-1);
            //     i=j+1;
            //     j++;
            // }

            if(sb.charAt(j) == ' '){    //we can write it like this also
                reversePart(sb, i, j - 1);
                i = j + 1;
            }
            j++;
        }
        System.out.println(sb);
    }

private static void reversePart(StringBuilder sb, int i , int j){
    while(i<j){
        char tempi = sb.charAt(i);
        char tempj = sb.charAt(j);
        sb.setCharAt(i, tempj);
        sb.setCharAt(j, tempi);
        i++;
        j--;
    }
}
}
