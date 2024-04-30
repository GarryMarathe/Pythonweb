import EvenModule.EvenPOA;
import java.lang.String;
import java.math.*;

class EvenImpl extends EvenPOA{
	EvenImpl(){
		super();
		System.out.println("Even Odd Prime Object Created");
	}
	public String oddeven(double num1){
		int flag = 0;
		if(num1 % 2 == 0)
			return "Even";
		else
			return "Odd";
	}
	public String prime(double num2){
		int flag = 0;
		for(int i=2;i<Math.sqrt(num2);i++){
			if(num2 % i == 0)
				flag = 1;
				break;
		}
		if(flag == 1)
			return "not Prime";
		else
			return "Prime";
	}
}
