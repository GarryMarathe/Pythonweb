import CalculatorModule.CalculatorPOA;
import java.lang.String;

class CalculatorImpl extends CalculatorPOA{
	CalculatorImpl(){
		super();
		System.out.println("Calculator Object Created");
	}
	
	public double addition(double num1,double num2){
		return num1 + num2;
	}
	public double subtraction(double num1,double num2){
		return num1 - num2;
	}
	public double multiplication(double num1,double num2){
		return num1 * num2;
	}
	public double division(double num1,double num2){
		return num1 / num2;
	}
}
