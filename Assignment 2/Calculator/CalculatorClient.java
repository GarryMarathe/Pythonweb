import CalculatorModule.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.io.*;

class CalculatorClient{
	public static void main(String[] args){
		try{
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
			
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			
			String name = "Calculator";
			Calculator calculator  = CalculatorModule.CalculatorHelper.narrow(ncRef.resolve_str(name));
			
			System.out.println("Enter two numbers to perform arithmetic operations: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter number 1: ");
			double num1 = Double.parseDouble(br.readLine());
			System.out.println("Enter number 2: ");
			double num2 = Double.parseDouble(br.readLine());
			
			System.out.println("----------Results----------");
			System.out.println("Addition is: " + calculator.addition(num1,num2));
			System.out.println("Subtraction is: " + calculator.subtraction(num1,num2));
			System.out.println("Multiplication is: " + calculator.multiplication(num1,num2));
			System.out.println("Division is: " + calculator.division(num1,num2));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
