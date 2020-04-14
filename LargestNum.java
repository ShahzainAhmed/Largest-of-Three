// Java program to find the largest among 3 numbers given by the user.

import java.util.*;
public class LargestNum{
public static void main (String args[]){
System.out.println ("Enter any 3 numbers. ");
Scanner s = new Scanner (System.in);
int n1 = s.nextInt(); // number 1
int n2 = s.nextInt(); // number 2 
int n3 = s.nextInt(); // number 3

if (n1>n2 && n1>n3) {
System.out.println (n1 + " is the larget number. "); }
else if (n2>n1 && n2>n3) {
System.out.println (n2 + " is the largest number. "); }
else if (n3>n1 && n3>n2) {
System.out.println (n3 + " is the largest number. "); }
}} 


// Output = if the user enters n1 = 5, n2 = 9, n3 = 18, then the output would be => "18 is the largest number."

// Output = if the user enters n1 = -2, n2 = -5, n3 = 0, then the output would be => "0 is the largest number." 