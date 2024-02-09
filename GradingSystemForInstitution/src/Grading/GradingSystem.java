package Grading;
import java.util.*;
public class GradingSystem 
{
public static void main(String args[])
{
Scanner ob = new Scanner(System.in);
System.out.println("Welcome To The Grading System");
//Prompt the user to enter his name
System.out.println("Enter Your Name");
String name=ob.nextLine();
//Prompt the user to enter his grade
System.out.println("Class");
int c=ob.nextInt();
//Prompt the user to enter the total number of subjects
System.out.println("Total Number Of Subjects");
int n=ob.nextInt();
//Prompt the user to enter the total marks achieved by him
System.out.println("Total Marks Achieved");
double tm=ob.nextDouble();
//Calculate the maximum marks
double mm=100.0*n;
//Calculate the percentage
double p=(tm/mm)*100.0;
//Determine the grade on the basis of percentage
String g=GradeCalculation(p);
//Print the percentage and grade achieved by the user
System.out.println("Percentage scored by "+name+" is "+p);
System.out.println("Grade Achieved = "+g);
}
public static String GradeCalculation(double pp)
{
if(pp>=90)
return("A");
else if(pp>=80)
return("B");
else if(pp>=70)
return("C");
else if(pp>=60)
return("D");
else
return("F");
}
}
