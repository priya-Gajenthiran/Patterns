import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
           int space =n-i-1;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            int star=2*i+1;
            for(int k=0;k<star;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
