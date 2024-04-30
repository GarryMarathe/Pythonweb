import java.rmi.*;
import java.lang.String;
import java.util.*;

public class Client{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			String serverurl = "rmi://localhost/Server";
			ServerIntf serverintf = (ServerIntf) Naming.lookup(serverurl);
			
			System.out.println("Enter a number to find Square Root: ");
			double num1 = sc.nextDouble();
			
			System.out.println("Enter a number to find Square: ");
			double num2 = sc.nextDouble();
			
			System.out.println("Enter two numbers to perform arithmetic calculations: ");
			System.out.println("Enter number 1: ");
			double num3 = sc.nextDouble();
			System.out.println("Enter number 2: ");
			double num4 = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter a String to find if it is Palindrome or not: ");
			String name = sc.nextLine();
			
			
			System.out.println("Enter two Strings to find if they are Equal or not: ");
			System.out.println("Enter String 1: ");
			String str1 = sc.nextLine();
			System.out.println("Enter String 2: ");
			String str2 = sc.nextLine();
			
			System.out.println("---------------Results---------------");
			System.out.println("Square root of " + num1 + " is " + serverintf.squareroot(num1));
			System.out.println("Square of " + num2 + " is " + serverintf.square(num2));
			System.out.println("Arithmetic Calculations:\n");
			System.out.println("Addition of " + num3 + " and " + num4 + " is: " + serverintf.addition(num3,num4));
			System.out.println("Subtraction of " + num3 + " and " + num4 + " is: " + serverintf.subtraction(num3,num4));
			System.out.println("Multiplication of " + num3 + " and " + num4 + " is: " + serverintf.multiplication(num3,num4));
			System.out.println("Division of " + num3 + " and " + num4 + " is: " + serverintf.division(num3,num4));
			System.out.println("\n");
			System.out.println("String " + name + " is: " + serverintf.isPalindrome(name));
			System.out.println("String " + str1 + " and " + str2 + " are: " + serverintf.isequal(str1,str2));
			
		}catch(Exception e){
			System.out.println("An Exception occurred " + e.getMessage());
		}
	}
}
