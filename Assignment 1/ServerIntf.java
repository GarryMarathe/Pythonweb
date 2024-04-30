import java.rmi.*;
import java.lang.String;

interface ServerIntf extends Remote{
	public double squareroot(double num1) throws RemoteException;
	public double square(double num2) throws RemoteException;
	public double addition(double num3,double num4) throws RemoteException;
	public double subtraction(double num3,double num4) throws RemoteException;
	public double multiplication(double num3,double num4) throws RemoteException;
	public double division(double num3,double num4) throws RemoteException;
	public String isPalindrome(String name) throws RemoteException;
	public String isequal(String str1, String str2) throws RemoteException;
}
