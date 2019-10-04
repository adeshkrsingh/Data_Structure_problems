/*
* Given two Number Array... array A and array B
* Find the values of B which are not in A
*/

import java.util.*;
import java.io.*;

class FindMissingNumber {
    public static void main(String[] args) {
        System.out.println("============== Starting ==============");
        int[] A = {10, 15, 18, 27, 29, 35, 46, 15, 22};

        int[] B = {29, 87, 27, 46, 15};

        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println("Array A contains : ");
        for(int i=0; i< A.length; i++) {
            System.out.print(A[i] + " "); 
        }
        
        System.out.println();
        System.out.println("Array B contains : ");
        for(int i=0; i< B.length; i++) {
            System.out.print(B[i] + " "); 
        }
        System.out.println();

        HashSet<Integer> set=new HashSet();

        for(int i=0; i< A.length; i++) {
            set.add(A[i]);
        }

        String notFoundList = " ";

        for(int j=0; j < B.length; j++) {
            if(!set.contains(B[j])) {
                notFoundList += B[j] + " ";
                System.out.println("Found");
            }
        }

        System.out.println("Values which are not present are : " + notFoundList);
    }
}