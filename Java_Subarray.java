import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] A = new int[n];
        
        for (int i = 0; i < n; i++) 
        {
             A[i] = sc.nextInt();
        }
        int numberOfSubArraysWithNegativeSum = 0;
        for(int i = 0; i < A.length; i++)
        {
            int checkSum = 0;
            for(int j = i; j < A.length; j++)
            {
                checkSum += A[j];
                if(checkSum < 0)
                {
                    numberOfSubArraysWithNegativeSum++;
                }
                
            }
        }
        System.out.println(numberOfSubArraysWithNegativeSum);
}
}
