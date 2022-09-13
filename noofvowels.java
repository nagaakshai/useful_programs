/*Finding no of vowels in given string and using inbuilt functions for checking 
each character and even converting the given string to lowercases as we did switch statements by lower cases**/

import java.io.*;
import java.util.*;
class noofvowels{
	public static void main(String args[])
	{
	    int n,i,v1=0,v2=0,v3=0,v4=0,v5=0;;
	    Scanner sc=new Scanner(System.in);
	    String s;
	    System.out.println("ENTER STRING");
	    s=sc.next();
	    s=s.toLowerCase();
	    n=s.length();
	    System.out.println("checking for no of a e i o u");
		for(i=0;i<n;i++){
		switch(s.charAt(i)){
		case 'a' :v1++;
			break;
		case 'e':v2++;
			break;
		case 'i' :v3++;
			break;
		case 'o':v4++;
			break;
		case 'u':v5++;
			break;
		
		}
		}
		System.out.println("a's are : "+v1+"\ne's are : "+v2+"\ni's are : "+v3+"\no's are : "+v4+"\nu's are : "+v5);
}
}
