import EvenModule.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.io.*;

class EvenClient{
	public static void main(String[] args){
		try{
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
			
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			
			String name = "Even";
			Even eve = EvenModule.EvenHelper.narrow(ncRef.resolve_str(name));
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a number to check Even or Odd: ");
			double num1 = Double.parseDouble(br.readLine());
			
			System.out.println("Enter a number to check if Prime or not: ");
			double num2 = Double.parseDouble(br.readLine());
			
			System.out.println("Rsults:");
			System.out.println(num1 + " is: " + eve.oddeven(num1));
			System.out.println(num2 + " is: " + eve.prime(num2));
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
