import java.rmi.*;
import java.rmi.server.*;
import java.math.*;
import java.lang.String;

public class ServerImpl extends UnicastRemoteObject
	implements ServerIntf{
	public ServerImpl() throws RemoteException{
	
	}
	public double squareroot(double num1) throws RemoteException{
		return Math.sqrt(num1);
	}
	public double square(double num2) throws RemoteException{
		return num2 * num2;
	}
	public double addition(double num3,double num4) throws RemoteException{
		return num3 + num4;
	}
	public double subtraction(double num3,double num4) throws RemoteException{
		return num3 - num4;
	}
	public double multiplication(double num3,double num4) throws RemoteException{
		return num3 * num4;
	}
	public double division(double num3,double num4) throws RemoteException{
		return num3 / num4;
	}
	public String isPalindrome(String name) throws RemoteException{
		StringBuffer str3 = new StringBuffer(name);
		str3.reverse();
		if(str3.equals(name.toString()))
			return "a Palindrome";
		else
			return "not a Palindrome";
	}
	public String isequal(String str1,String str2) throws RemoteException{
		if(str1.equals(str2))
			return "Equal";
		else
			return "not Equal";
	}
}
