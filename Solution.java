/*A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input

madam
Sample Output

Yes */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String n="";
        char c;
        for(int i=0;i<A.length();i++)
        {
            c=A.charAt(i);
            n=c+n;           
        }
        
        if(A.equals(n)){
        System.out.println("Yes");}
        else{
        System.out.println("No");
        }/* Enter your code here. Print output to STDOUT. */
        
    }
}



